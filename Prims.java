import java.util.Scanner; 
public class Prims {
    public static void main(String[] args) {
    int a = 0, b = 0, u = 0, v = 0, n, i, j, ne = 1; int[] visited = new int[10];
    int min, mincost = 0;
    int[][] cost = new int[10][10];
    Scanner scanner = new Scanner(System.in); System.out.println("Enter the number of vertices and graph data"); n = scanner.nextInt();
    for (i = 1; i <= n; i++) { for (j = 1; j <= n; j++) {
    System.out.printf("(%d,%d):", i, j); cost[i][j] = scanner.nextInt();
    if (cost[i][j] == 0) {
    cost[i][j] = 999;
    }
    }
    }
    for (i = 1; i <= n; i++) { visited[i] = 0;
    }
    System.out.println("The edges of spanning tree are"); visited[1] = 1;
    while (ne < n) {
    for (i = 1, min = 999; i <= n; i++) { for (j = 1; j <= n; j++) {
    if (cost[i][j] < min) { if (visited[i] == 0) {
     
    continue;
    } else {
    min = cost[i][j];
    a = u = i;
    b = v = j;
    }
    }
    }
    }
    if (visited[u] == 0 || visited[v] == 0) {
    System.out.printf("%d: edge (%d,%d) = %d\n", ne++, a, b, min); mincost += min;
    visited[b] = 1;
    }
    cost[a][b] = cost[b][a] = 999;
    }
    System.out.printf("\nMinimum cost is %d\n", mincost); scanner.close();
    }
    }
    
