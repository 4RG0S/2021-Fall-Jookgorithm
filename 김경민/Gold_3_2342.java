import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Gold_3_2342 {
  static int getPower(int from, int to) {
    if (from == 0) {
      return 2;
    } else if (from == to) {
      return 1;
    } else if (Math.abs(from - to) == 1 || Math.abs(from - to) == 3) {
      return 3;
    } else {
      return 4;
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer line = new StringTokenizer(br.readLine());
    ArrayList<Integer> list = new ArrayList<>();
    while(line.hasMoreTokens()) {
      int token = Integer.parseInt(line.nextToken());
      if (token != 0) {
        list.add(token);
      }
    }
    // (0, 0), (0, 1), (0, 2) ... (5, 5)
    int sumOfPower[][] = new int[25][list.size() + 1];
    for (int i = 0; i < 25; i += 1) {
      for (int j = 0; j < list.size() + 1; j += 1) {
        sumOfPower[i][j] = Integer.MAX_VALUE;
      }
    }
    sumOfPower[0][0] = 0;
    for (int index = 0; index < list.size(); index += 1) {
      int iter = list.get(index);
      for (int j = 0; j < 25; j += 1) {
        if (sumOfPower[j][index] != Integer.MAX_VALUE) {
          int leftFootIndex = j / 5;
          int rightFootIndex = j % 5;
          // Move left foot
          if (rightFootIndex != iter) {
            int power = getPower(leftFootIndex, iter);
            sumOfPower[iter * 5 + rightFootIndex][index + 1] = Integer.min(sumOfPower[j][index] + power, sumOfPower[iter * 5 + rightFootIndex][index + 1]);
          }
          // Move right foot
          if (leftFootIndex != iter) {
            int power = getPower(rightFootIndex, iter);
            sumOfPower[leftFootIndex * 5 + iter][index + 1] = Integer.min(sumOfPower[j][index] + power, sumOfPower[leftFootIndex * 5 + iter][index + 1]);
          }
        }
      }
    }
    int result = Integer.MAX_VALUE;
    for (int i = 0; i < 25; i += 1) {
      result = Integer.min(result, sumOfPower[i][list.size()]);
    }
    System.out.println(result);
  }
}
