import java.util.Random; 
import java.util.Scanner;
public class SelectionSort {
    public static void selectionSort(int[] a, int n) { int i, j, minIndex, temp;
    for (i = 0; i < n - 1; i++) { minIndex = i;
    for (j = i + 1; j < n; j++) {
    
    if (a[j] < a[minIndex]) 
    minIndex = j;
    }
    
    temp = a[minIndex];
     a[minIndex] = a[i];
      a[i] = temp;
    }
    
    }
   
     
    public static void main(String[] args) { int[] a = new int[10000];
    int n;
    
    double timeTaken; long start, end;
    System.out.println("Enter  number of elements:"); java.util.Scanner scanner = new java.util.Scanner(System.in); n = scanner.nextInt();
    scanner.close();
    
    Random rand = new Random(); for (int i = 0; i < n; i++) {
    a[i] = rand.nextInt(10000);
    
    }
    
    start = System.currentTimeMillis(); selectionSort(a, n);
    end = System.currentTimeMillis(); 
    timeTaken = (end - start);
    
    System.out.println("Time taken to sort elements = " + timeTaken + " ms");
    
    }
    
    }
    