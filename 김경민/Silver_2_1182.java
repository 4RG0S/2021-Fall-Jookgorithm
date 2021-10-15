import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_2_1182 {
  static int array[];
  static int result = 0;
  static int S;
  static void combination(int n, int r, int pick, int sum) {
    if (r == 0) {
      if (S == sum) {
        result++;
      }
      return;
    }
    if (pick == n) {
      return;
    }
    for(int i=pick+1;i<=n;i++) {
      sum += array[i];
      combination(n, r - 1, i, sum);
      sum -= array[i];
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer line = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(line.nextToken());
    S = Integer.parseInt(line.nextToken());
    array = new int[N + 1];
    line = new StringTokenizer(br.readLine());
    for (int i = 1; i <= N; i += 1) {
      array[i] = Integer.parseInt(line.nextToken());
    }
    for (int i=1;i<=N;i++) {
      combination(N, i, 0, 0);
      // System.out.println(result);
    }
    System.out.println(result);
  }
}
