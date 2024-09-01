import java.util.Random; import java.util.Scanner;

public class MergeSort {
public static void merge(int[] array, int low, int mid, int high) { int i = low;
int j = mid + 1; int k = low;
int[] resarray = new int[array.length]; while (i <= mid && j <= high) {
if (array[i] < array[j]) { resarray[k++] = array[i++];
} else {
resarray[k++] = array[j++];
}
}
while (i <= mid) { resarray[k++] = array[i++];
}
while (j <= high) { resarray[k++] = array[j++];
}
for (int m = low; m <= high; m++) { array[m] = resarray[m];
}
}
public static void sort(int[] array, int low, int high) { if (low < high) {
int mid = (low + high) / 2; sort(array, low, mid); sort(array, mid + 1, high); merge(array, low, mid, high);
}
}
public static void main(String[] args) { int[] array = new int[10000];
int n;
Scanner scanner = new Scanner(System.in); System.out.println("Enter the array size:"); n = scanner.nextInt();
scanner.close();
Random rand = new Random(); for (int i = 0; i < n; i++) {
array[i] = rand.nextInt(10000);
}
long start = System.currentTimeMillis(); 
sort(array, 0, n - 1);
long end = System.currentTimeMillis();
double elapsedTime = (end - start);
System.out.println("Time taken to sort array is: " + elapsedTime + " milliseconds");
}
}

