package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RGBStreet {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] RGB = new int[N][3];
        int[][] dp = new int[N][3];

        for(int i = 0; i < N; i++) Arrays.fill(dp[i], Integer.MAX_VALUE);

        for(int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) RGB[i][j] = Integer.parseInt(s[j]);
        }

        dp[0][0] = RGB[0][0]; dp[0][1] = RGB[0][1]; dp[0][2] = RGB[0][2];

        for(int i = 1; i < N; i++)
            for(int j = 0; j < 3; j++)
                for(int k = 0; k < 3; k++)
                    if(j != k) dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + RGB[i][j]);

        int answer = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++) answer = Math.min(answer, dp[N - 1][i]);

        System.out.println(answer);

    }
}
