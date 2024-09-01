
import java.util.Scanner; public class warshall {
    static int[][] a = new int[10][10]; static int n;
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of vertices"); n = scanner.nextInt();
    
    System.out.println("Enter the adjacency matrix"); for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) { System.out.printf("(%d,%d): ", i, j); a[i][j] = scanner.nextInt();
    }
    }
     
    warshall(a, n);
    
    
    System.out.println("All pair distance matrix"); for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) { System.out.print(a[i][j] + "\t");
    }
    System.out.println();
    }
    scanner.close();
    }
    static void warshall(int[][] a, int n) { for (int k = 1; k <= n; k++) {
    for (int j = 1; j <= n; j++) { for (int i = 1; i <= n; i++) {
    a[i][j] = a[i][j] | (a[i][k] & a[k][j]);
    }
    }
    }
    }
    }
    