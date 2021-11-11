package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JunGyuMoving {

    /*
    static int N, M;
    static int[][] map;
    static int[][] dp;
    static int[][] move = {{0, 1}, {1, 0}};

    static void dfs(int[] position) {

        for(int i = 0; i < 2; i++) {
            int row = move[i][0] + position[0];
            int column = move[i][1] + position[1];
            if(row < N && column < M) {
                int value = dp[position[0]][position[1]] + map[row][column];
                if(value > dp[row][column]) {
                    dp[row][column] = value;
                    dfs(new int[]{row, column});
                }
            }
        }
    }
    */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp = br.readLine().split(" ");
        int N = Integer.parseInt(tmp[0]);
        int M = Integer.parseInt(tmp[1]);
        int[][] map = new int[N + 1][M + 1];
        int[][] dp = new int[N + 1][M + 1];

        for(int i = 1; i < N + 1; i++) {
            tmp = br.readLine().split(" ");
            for(int j = 0; j < M; j++) map[i][j + 1] = Integer.parseInt(tmp[j]);
        }

        dp[0][0] = map[0][0];

        for(int i = 1; i < N + 1; i++) {
            for(int j = 1; j < M + 1; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + map[i][j];
            }
        }

        System.out.println(dp[N][M]);

    }
}
