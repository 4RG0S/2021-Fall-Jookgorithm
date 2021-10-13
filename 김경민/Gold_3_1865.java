import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Gold_3_1865 {
  static List<List<Path>> list;
  static int minVal[];
  static boolean isMinValChanged;
  static boolean isVisit[];
  static class Path {
    int dest, val;
    public Path(int dest, int val) {
      this.dest = dest;
      this.val = val;
    }
  }

  static void dfs(int here) {
    isVisit[here] = true;
    for (Path path : list.get(here)) {
      if (isVisit[path.dest]) {
        continue;
      }
      dfs(path.dest);
    }
  }

  static void updateMinVal() {
    for (int here = 1; here < minVal.length; here += 1) {
      int minValue = minVal[here];
      if (minValue == Integer.MAX_VALUE) {
        continue;
      }
      for (Path path : list.get(here)) {
        int there = path.dest;
        int lessValue = Integer.min(minVal[there], minVal[here] + path.val);
        if (lessValue != minVal[there]) {
          isMinValChanged = true;
          minVal[there] = lessValue;
        }
      }
    }
  }
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int TC = Integer.parseInt(br.readLine());
    for (int i = 0; i < TC; i += 1) {
      StringTokenizer line = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(line.nextToken());
      int M = Integer.parseInt(line.nextToken());
      int W = Integer.parseInt(line.nextToken());
      minVal = new int[N + 1];
      isVisit = new boolean[N + 1];
      list = new ArrayList<>();
      for (int j = 0; j <= N; j += 1) {
        list.add(new ArrayList<>());
        minVal[j] = Integer.MAX_VALUE;
      }
      for (int j = 0; j < M; j += 1) {
        line = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(line.nextToken());
        int to = Integer.parseInt(line.nextToken());
        int val = Integer.parseInt(line.nextToken());
        list.get(from).add(new Path(to, val));
        list.get(to).add(new Path(from, val));
      }
      for (int j = 0; j < W; j += 1) {
        line = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(line.nextToken());
        int to = Integer.parseInt(line.nextToken());
        int val = Integer.parseInt(line.nextToken()) * -1;
        list.get(from).add(new Path(to, val));
      }
      for (int j = 1; j <= N; j += 1) {
        if (!isVisit[j]) {
          minVal[j] = 0;
          dfs(j);
        }
      }
      for (int j = 0; j < N; j += 1) {
        isMinValChanged = false;
        updateMinVal();
      }
      System.out.println((isMinValChanged) ? "YES" : "NO");
    }
  }
}
