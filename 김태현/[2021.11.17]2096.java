package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DescendingGame {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] table = new int[N][3];
        int[][] dp1 = new int[N][3];
        int[][] dp2 = new int[N][3];

        int[][] m = { {0, 1}, {0, 1, 2}, {1, 2} };

        for(int i = 0; i < N; i++) Arrays.fill(dp2[i], Integer.MAX_VALUE);
        for(int i = 0; i < N; i++) {
            String[] tmp = br.readLine().split(" ");
            for(int j = 0; j < 3; j++) table[i][j] = Integer.parseInt(tmp[j]);
        }

        for(int i = 0; i < 3; i++) {
            dp1[0][i] = table[0][i];
            dp2[0][i] = table[0][i];
        }

        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < m[j].length; k++) {
                    dp1[i + 1][m[j][k]] = Math.max(dp1[i + 1][m[j][k]], dp1[i][j] + table[i + 1][m[j][k]]);
                    dp2[i + 1][m[j][k]] = Math.min(dp2[i + 1][m[j][k]], dp2[i][j] + table[i + 1][m[j][k]]);
                }
            }
        }

        int answer1 = 0;
        int answer2 = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++) {
            answer1 = Math.max(answer1, dp1[N - 1][i]);
            answer2 = Math.min(answer2, dp2[N - 1][i]);
        }

        System.out.println(answer1 + " " + answer2);

    }

}
