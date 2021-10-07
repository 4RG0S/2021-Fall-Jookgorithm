package baekjoon;

import java.util.Scanner;

public class IntegerTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] triangle = new int[n][n];
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < i + 1; j++) triangle[i][j] = dp[i][j] = scanner.nextInt();

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                if(j != i) dp[i][j] = Math.max(dp[i][j], triangle[i][j] + dp[i - 1][j]);
                if(j != 0) dp[i][j] = Math.max(dp[i][j], triangle[i][j] + dp[i - 1][j - 1]);
            }
        }

        int answer = 0;
        for(int i = 0; i < n; i++) answer = Math.max(answer, dp[n - 1][i]);
        System.out.println(answer);
    }
}
