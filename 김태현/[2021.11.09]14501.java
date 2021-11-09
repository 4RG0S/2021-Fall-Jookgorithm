package baekjoon;

import java.util.Scanner;

public class LeavingJob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();

        int[] time = new int[N + 1];
        int[] pay = new int[N + 1];
        int[] dp = new int[N + 1];

        for(int i = 1; i < N + 1; i++) {
            time[i] = scanner.nextInt();
            pay[i] = scanner.nextInt();
        }

        for(int i = 1; i < N + 1; i++) {
            int index = time[i] + i - 1;
            for(int j = 1; j <= i; j++)
                if(index < N + 1) dp[index] = Math.max(dp[index], dp[i - j] + pay[i]);
        }

        int answer = 0;
        for(int i = 0; i < N + 1; i++) answer = Math.max(answer, dp[i]);
        System.out.println(answer);

    }
}
