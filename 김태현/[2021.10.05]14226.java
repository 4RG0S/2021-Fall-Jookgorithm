package baekjoon;

import java.util.Scanner;

public class YeongSeonEmoticon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();
        int[] dp = new int[S + 1];

        for(int i = 1; i < S + 1; i++) dp[i] = i;

        for(int i = 2; i < S + 1; i++) {
            for(int j = i + 1; j < S + 1; j++) {
                /* int multiplier = 0;
                while(i * multiplier < j) multiplier++; */
                int multiplier = j % i == 0 ? (int)(j / i) : (int)(j / i) + 1;
                dp[j] = Math.min(dp[j], dp[i] + (i * multiplier - j) + multiplier);
            }
        }
        System.out.println(dp[S]);
    }
}
