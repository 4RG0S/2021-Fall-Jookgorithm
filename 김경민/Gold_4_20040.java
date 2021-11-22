import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_4_20040 {
  static int parent[];

  static int findParent(int node) {
    if (parent[node] == node) {
      return node;
    }
    return parent[node] = findParent(parent[node]);
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer line = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(line.nextToken());
    int m = Integer.parseInt(line.nextToken());
    int result = Integer.MAX_VALUE;
    parent = new int[n];
    for (int i=0;i<n;i++) {
      parent[i] = i;
    }
    for (int i=0;i<m;i++) {
      line = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(line.nextToken());
      int to = Integer.parseInt(line.nextToken());
      if (findParent(to) == findParent(from)) {
        result = i + 1;
        break;
      }
      parent[findParent(to)] = findParent(from);
    }

    System.out.println(result);
  }
}
