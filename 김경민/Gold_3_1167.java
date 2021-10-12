import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Gold_3_1167 {
  static int V;
  static int maxLen[];
  static boolean isVisit[];
  static List<List<Path>> list = new ArrayList<>();

  static class Path {
    int dest, len;
    public Path(int dest, int len) {
      this.dest = dest;
      this.len = len;
    }
  }

  static int getLargestElementIndex(int arr[]) {
    int maxIndex = 0;
    for (int i = 1; i <= V; i += 1) {
      maxIndex = (arr[maxIndex] < arr[i]) ? i : maxIndex;
    }

    return maxIndex;
  }

  static void postBeforeDFS() {
    isVisit = new boolean[V + 1];
    maxLen = new int[V + 1];
  }

  static void dfs(int here) {
    isVisit[here] = true;
    for (Path path : list.get(here)) {
      int there = path.dest;
      if (isVisit[there]) {
        continue;
      }
      maxLen[there] = maxLen[here] + path.len;
      dfs(there);
    }
  }

  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    V = Integer.parseInt(br.readLine());
    for (int i = 0; i <= V; i += 1) {
      list.add(new ArrayList<>());
    }
    for (int i = 0; i < V; i += 1) {
      StringTokenizer line = new StringTokenizer(br.readLine());
      int index = Integer.parseInt(line.nextToken());
      while (true) {
        int dest = Integer.parseInt(line.nextToken());
        if (dest == -1) {
          break;
        }
        int len = Integer.parseInt(line.nextToken());
        list.get(index).add(new Path(dest, len));
      }
    }
    postBeforeDFS();
    dfs(1);
    int maxIndex = getLargestElementIndex(maxLen);

    postBeforeDFS();
    dfs(maxIndex);
    System.out.println(maxLen[getLargestElementIndex(maxLen)]);
  }
}
