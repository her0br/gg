import java.util.Scanner;
class Prims {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter Number of Vertices");
 int n = scan.nextInt();
 int[][] costMatrix = new int[n][n];
 boolean[] visited = new boolean[n];
 System.out.println("Enter Cost Adjacency Matrix");
 for (int i = 0; i < n; i++)
 for (int j = 0; j < n; j++)
 costMatrix[i][j] = scan.nextInt();
 for (int i = 0; i < n; i++)
 visited[i] = false;
 System.out.println("Enter Source Vertex");
 int srcVertex = scan.nextInt();
 scan.close();
 visited[srcVertex - 1] = true;
 int source = 0, cost = 0, target = 0;
 System.out.print("Edges: ");
 
 for (int i = 1; i < n; i++) {
 int min = Integer.MAX_VALUE;
 for (int j = 0; j < n; j++) {
 if (visited[j]) {
 for (int k = 0; k < n; k++) {
 if (!visited[k] && min > costMatrix[j][k]) {
 min = costMatrix[j][k];
 source = j;
 target = k;
 }
 }
 }
 }
 visited[target] = true;
 System.out.print("(" + (source + 1) + "," + (target + 1) + ")");
 cost += min;
 }
 System.out.println("\nMinimum cost of Spanning Tree: " + cost);
 }
}