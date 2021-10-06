package baekjoon;

import java.util.Scanner;

public class OneTwoThreeAddition5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[][] dp = new long[100001][4];
        dp[1][1] = 1; dp[2][2] = 1; dp[3][1] = 1; dp[3][2] = 1; dp[3][3] = 1;

        for(int i = 4; i < 100001; i++) {
            dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % 1000000009;
            dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1000000009;
            dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1000000009;
        }

        int T = scanner.nextInt();

        for(int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            System.out.println((dp[n][1] % 1000000009 + dp[n][2] % 1000000009 + dp[n][3] % 1000000009) % 1000000009);
        }
        System.out.println();

    }
}
