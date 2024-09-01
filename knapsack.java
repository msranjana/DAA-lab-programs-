import java.util.Scanner;
public class knapsack {
static int[][] v = new int[20][20]; 
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); 
int n, max;
int[] p = new int[20]; 
int[] w = new int[20];
System.out.println("Enter the number of items"); 
n = scanner.nextInt();
for (int i = 1; i <= n; i++) {
System.out.printf("Enter the weight and profit of the item %d: ", i); 
w[i] = scanner.nextInt();
p[i] = scanner.nextInt();
}
System.out.println("Enter the capacity of knapsack"); max = scanner.nextInt();
for (int i = 0; i <= n; i++) 
 v[i][0] = 0;
for (int i = 0; i <= max; i++) 
 v[0][i] = 0;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= max; j++) { 
if (w[i] > j)
v[i][j] = v[i - 1][j]; 
else
v[i][j] = max_value(v[i - 1][j], v[i - 1][j - w[i]] + p[i]);
}
}
System.out.println("The table is"); 
for (int i = 0; i <= n; i++) {
for (int j = 0; j <= max; j++) { 
    System.out.print(v[i][j] + "\t");
}
System.out.println();
}
System.out.println("The max profit is " + v[n][max]); System.out.print("Most profitable subset is: {");
int j = max;
for (int i = n; i >= 1; i--) { if (v[i][j] != v[i - 1][j]) {
System.out.printf("item%d:1\t", i); j = j - w[i];
} 
else {
System.out.printf("item%d:0\t", i);
}
}
System.out.println("}");
scanner.close();
}
static int max_value(int a, int b) { 
    return (a > b ? a : b);
}

}
