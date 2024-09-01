import java.util.Scanner;
public class Dijkstra{ static int n;
static int[][] cost = new int[10][10]; static int[] dist = new int[10];
public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of vertices"); n = scanner.nextInt();
System.out.println("Enter the cost adjacency matrix (999 for infinite)"); readMatrix(scanner, n);
System.out.println("Enter the source vertex"); int s = scanner.nextInt();
shortestPath(n, s);
for (int i = 1; i <= n; i++) {
System.out.printf("The shortest path between vertex %d to %d is %d\n", s, i, dist[i]);
}
scanner.close();
}


static int min(int a, int b) { return a > b ? b : a;
}

static void readMatrix(Scanner scanner, int n) { for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) { System.out.printf("(%d,%d): ", i, j); cost[i][j] = scanner.nextInt();
if (cost[i][j] == 0) {
 
cost[i][j] = 999;
}
}
}
}


static void shortestPath(int n, int s) { int[] vis = new int[10];
int c, u = 0;
for (int i = 1; i <= n; i++) { vis[i] = 0;
dist[i] = cost[s][i];
}
dist[s] = 0;
vis[s] = 1;
for (int k = 1; k <= n; k++) { c = 999;
for (int i = 1; i <= n; i++) { if (vis[i] == 0) {
if (dist[i] <= c) { c = dist[i];
u = i;
}
}
}
vis[u] = 1;
for (int i = 1; i <= n; i++) {
dist[i] = min(dist[i], dist[u] + cost[u][i]);
}
}
}
}
