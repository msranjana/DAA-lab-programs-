import java.util.Scanner;

public class floyd {
static int[][] a = new int[10][10]; 
static int n;
public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of vertices"); n = scanner.nextInt();
 
System.out.println("Enter the cost matrix"); 
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
     a[i][j] = scanner.nextInt();
}
}

long start = System.currentTimeMillis(); 
floyd(a, n);
long end = System.currentTimeMillis();
System.out.println("Shortest path matrix is"); 
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
    System.out.print(a[i][j] + "\t");
}
System.out.println();
}
System.out.printf("Time taken is %d ms\n", (end - start));
scanner.close();
}
static int min(int a, int b) { 
    return (a < b ? a : b);
}
static void floyd(int[][] w, int n) { 
for (int k = 1; k <= n; k++) {
for (int i = 1; i <= n; i++) { 
for (int j = 1; j <= n; j++) {
w[i][j] = min(w[i][j], w[i][k] + w[k][j]);
}
}
}
}
}

