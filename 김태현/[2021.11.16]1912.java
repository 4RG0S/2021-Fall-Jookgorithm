package baekjoon;

import java.util.Scanner;

public class SuccessiveSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt() + 1;
        int[] dp = new int[n];
        for(int i = 1; i < n; i++) dp[i] = scanner.nextInt();
        scanner.close();

        int answer = -1 * Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            if(dp[i - 1] >= 0) dp[i] += dp[i - 1];
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);

    }
}
