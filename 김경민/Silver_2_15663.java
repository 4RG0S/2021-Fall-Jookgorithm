import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver_2_15663 {
  static int count[] = new int[10000];

  static void backTrack(int M, Stack<Integer> stack) {
    if (M == 0) {
      for (Object iter : stack.toArray()) {
        System.out.print(iter + " ");
      }
      System.out.println();
    } else {
      for (int i=0;i<10000;i++) {
        if (count[i] != 0) {
          count[i]--;
          stack.push(i + 1);
          backTrack(M - 1, stack);
          stack.pop();
          count[i]++;
        }
      }
    }
  }
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer line = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(line.nextToken());
    int M = Integer.parseInt(line.nextToken());

    line = new StringTokenizer(br.readLine());
    for (int i=0;i<N;i++) {
      count[Integer.parseInt(line.nextToken()) - 1]++;
    }
    backTrack(M, new Stack<>());
  }
}
