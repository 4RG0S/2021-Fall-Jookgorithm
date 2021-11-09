import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver_2_15666 {

  static void backtrack(int num[], int M, int pickIndex, Stack<Integer> stack) {
    if (stack.size() == M) {
      stack.stream().forEach(i->System.out.print(i + " "));
      System.out.println();
    } else {
      for (int i = pickIndex; i < num.length; i += 1) {
        stack.push(num[i]);
        backtrack(num, M, i, stack);
        stack.pop();
      }
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer line = new StringTokenizer(br.readLine());
    ArrayList<Integer> list = new ArrayList<>();
    int N = Integer.parseInt(line.nextToken());
    int M = Integer.parseInt(line.nextToken());
    boolean isNum[] = new boolean[10001];
    line = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i += 1) {
      int num = Integer.parseInt(line.nextToken());
      isNum[num] = true;
    }
    for (int i = 1; i <= 10000; i += 1) {
      if (isNum[i]) {
        list.add(i);
      }
    }
    backtrack(list.stream().mapToInt(i->i).toArray(), M, 0, new Stack<Integer>());
  }
}
