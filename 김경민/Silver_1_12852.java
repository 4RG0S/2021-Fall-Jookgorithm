import java.util.Scanner;
import java.util.Stack;

public class Silver_1_12852 {
  static int val[];
  static int index[];
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    val = new int[N + 1];
    index = new int[N + 1];
    val[N] = 1;
    index[N] = -1;
    for (int i = N; i > 0; i -= 1) {
      if (i % 3 == 0) {
        if (val[i / 3] == 0) {
          val[i / 3] = val[i] + 1;
          index[i / 3] = i;
        } else if (val[i / 3] > val[i] + 1) {
          val[i / 3] = val[i] + 1;
          index[i / 3] = i;
        }
      }
      if (i % 2 == 0) {
        if (val[i / 2] == 0) {
          val[i / 2] = val[i] + 1;
          index[i / 2] = i;
        } else if (val[i / 2] > val[i] + 1) {
          val[i / 2] = val[i] + 1;
          index[i / 2] = i;
        }
      }
      if (val[i - 1] == 0) {
        val[i - 1] = val[i] + 1;
        index[i - 1] = i;
      } else if (val[i - 1] > val[i] + 1) {
        val[i - 1] = val[i] + 1;
        index[i - 1] = i;
      }
    }
    Stack<Integer> stack = new Stack<>();
    System.out.println(val[1] - 1);
    int temp = 1;
    while(true) {
      stack.push(temp);
      if (index[temp] == -1) {
        break;
      }
      temp = index[temp];
    }
    while(!stack.isEmpty()) {
      System.out.print(stack.pop() + " ");
    }

    scan.close();
  }
}
