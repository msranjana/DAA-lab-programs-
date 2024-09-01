
import java.util.Scanner; public class Queens { static int count = 0;
    static int[] x = new int[5];
    
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of queens"); int n = scanner.nextInt();
    nQueen(1, n);
    
    if (count == 0) {
    
    System.out.println("No solutions are found");
    
    } else {
    
    System.out.println("Number of solutions found are " + count);
    
    }
    
    scanner.close();
    
    }
    
    static boolean place(int k, int i) { for (int j = 1; j < k; j++) {
    if (x[j] == i || Math.abs(x[j] - i) == Math.abs(j - k)) { return false;
    }
     
    }
    
    return true;
    
    }
    
    static void nQueen(int k, int n) { for (int i = 1; i <= n; i++) {
    if (place(k, i)) { x[k] = i;
    if (k == n) { count++;
    System.out.println("Solution " + count); for (int j = 1; j <= n; j++) {
    for (int p = 1; p <= n; p++) { if (x[j] == p) {
    System.out.print("$\t");
    
    } else {
    
    System.out.print("0\t");
    
    }
    
    }
    System.out.println();
   
    }
    
    System.out.println();
    
    } else {
    
    nQueen(k + 1, n);
    
    }
    
    }
    
    }
    
    }
     
    }
    
    