import java.util.Scanner;

public class Gold_1_1562 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int sum[][][] = new int[N][10][1024];
    for (int j=1;j<10;j++) {
      for (int k=0;k<10;k++) {
        sum[0][j][(int)Math.pow(2, k)] = 1;
      }
    }
    for (int i=1;i<N;i++) {
      for (int j=0;j<10;j++) {
        for (int k=0;k<1024;k++) {
          if (j == 0) {
            if (((k >> j + 1) & 1) == 1) {
              sum[i][j][k] = (sum[i][j][k] + sum[i-1][j+1][k]) % 1000000000;
            } else {
              sum[i][j][k + (int)Math.pow(2, j + 1)] = (sum[i][j][k + (int)Math.pow(2, j + 1)] + sum[i-1][j+1][k]) % 1000000000;
            }
          } else if (j == 9) {
            if (((k >> j - 1) & 1) == 1) {
              sum[i][j][k] = (sum[i][j][k] + sum[i-1][j-1][k]) % 1000000000;
            } else {
              sum[i][j][k + (int)Math.pow(2, j - 1)] = (sum[i][j][k + (int)Math.pow(2, j - 1)] + sum[i-1][j-1][k]) % 1000000000;
            }
          } else {
            if (((k >> j + 1) & 1) == 1) {
              sum[i][j][k] = (sum[i][j][k] + sum[i-1][j+1][k]) % 1000000000;
            } else {
              sum[i][j][k + (int)Math.pow(2, j + 1)] = (sum[i][j][k + (int)Math.pow(2, j + 1)] + sum[i-1][j+1][k]) % 1000000000;
            }
            if (((k >> j - 1) & 1) == 1) {
              sum[i][j][k] = (sum[i][j][k] + sum[i-1][j-1][k]) % 1000000000;
            } else {
              sum[i][j][k + (int)Math.pow(2, j - 1)] = (sum[i][j][k + (int)Math.pow(2, j - 1)] + sum[i-1][j-1][k]) % 1000000000;
            }
          }
        }
      }
    }
    int result = 0;
    for (int i=0;i<10;i++) {
      System.out.println((result + sum[N-1][i][1023]));
      result = (result + sum[N-1][i][1023]) % 1000000000;
    }
    System.out.println(result);

    scan.close();
  }
}
