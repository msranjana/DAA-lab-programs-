
    import java.util.Scanner; 
    public class GreedyKnapsack {
    static int[] p = new int[50], w = new int[50];
    static int[] x = new int[50]; // Use int array for solution vector static double maxprofit;
    static int n, m;
    public static void greedyKnapsack(int n, int[] w, int[] p, int m) { double[] ratio = new double[50];
    for (int i = 0; i < n; i++) { ratio[i] = (double) p[i] / w[i];
    }
    for (int i = 0; i < n - 1; i++) { for (int j = i + 1; j < n; j++) {
     
    if (ratio[i] < ratio[j]) { double temp = ratio[i]; ratio[i] = ratio[j]; ratio[j] = temp;
    
    int temp2 = w[i]; w[i] = w[j];
    w[j] = temp2;
    
    
    temp2 = p[i]; p[i] = p[j]; p[j] = temp2;
    }
    }
    }
    int currentWeight = 0; 
    double maxprofit = 0.0;
    
    for (int i = 0; i < n; i++) {
    if (currentWeight + w[i] <= m) { x[i] = 1;
    currentWeight += w[i]; maxprofit += p[i];
    } else {
    x[i] = (m - currentWeight) / w[i]; maxprofit += x[i] * p[i];
    break;
    }
    }
    System.out.printf("Optimal solution for greedy method: %.1f\n", maxprofit); System.out.print("Solution vector for greedy method: ");
    for (int i = 0; i < n; i++) { System.out.printf("%d\t", x[i]);
    }
    System.out.println();
    }
     
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the number of objects: "); 
    n = scanner.nextInt();
    
    System.out.print("Enter the objects' weights: "); 
    for (int i = 0; i < n; i++) {
    w[i] = scanner.nextInt();
    }
    
    
    System.out.print("Enter the objects' profits: "); 
    for (int i = 0; i < n; i++) {
    p[i] = scanner.nextInt();
    }
    System.out.print("Enter the maximum capacity: "); 
    m = scanner.nextInt();
    
    greedyKnapsack(n, w, p, m); scanner.close();
    }
    }
    