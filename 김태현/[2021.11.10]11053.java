package baekjoon;

import java.util.Scanner;

public class AscendingSubsequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] seq = new int[N + 1];
        int[] dp = new int[N + 1];

        for(int i = 1; i < N + 1; i++) seq[i] = scanner.nextInt();

        for(int i = 1; i < N + 1; i++) {
            int cur = seq[i];
            int max = 0;
            for(int j = 0; j < i; j++) {
                if(seq[j] < cur) max = Math.max(max, dp[j]);
            }
            dp[i] = max + 1;
        }

        int answer = 0;
        for(int i = 1; i < N + 1; i++) answer = Math.max(answer, dp[i]);
        System.out.println(answer);
    }
}
