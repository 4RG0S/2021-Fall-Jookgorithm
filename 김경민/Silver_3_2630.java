import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_3_2630 {
  static int blueCount = 0;
  static int whiteCount = 0;
  static boolean isBlue[][];

  static boolean isSameColor(int x, int y, int len) {
    boolean isNot = !isBlue[y][x];
    boolean result = true;
    for (int i=y;i<y+len;i++) {
      for (int j=x;j<x+len;j++) {
        result = result & (isBlue[i][j] ^ isNot);
      }
    }

    return result;
  }
  static void recursion(int x, int y, int len) {
    if (!isSameColor(x, y, len)) {
      recursion(x, y, len / 2);
      recursion(x + len / 2, y, len / 2);
      recursion(x, y + len / 2, len / 2);
      recursion(x + len / 2, y + len / 2, len / 2);
    } else {
      if (isBlue[y][x]) {
        blueCount += 1;
      } else {
        whiteCount += 1;
      }
    }
  }
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    isBlue = new boolean[N][N];
    for (int i=0;i<N;i++) {
      StringTokenizer line = new StringTokenizer(br.readLine());
      for (int j=0;j<N;j++) {
        isBlue[i][j] = line.nextToken().equals("1");
      }
    }

    recursion(0, 0, N);
    System.out.println(whiteCount);
    System.out.println(blueCount);
  }
}
