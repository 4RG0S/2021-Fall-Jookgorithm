package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LCS {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] s1 = br.readLine().toCharArray();
        char[] s2 = br.readLine().toCharArray();
        int[] dp = new int[s1.length + 1];

        for(int i = 0; i < s2.length; i++) {
            int[] tmp = Arrays.copyOf(dp, dp.length);
            for(int j = 0; j < s1.length; j++) {
                if(s1[j] == s2[i]) {
                    int max = 0;
                    for(int k = 0; k <= j; k++) max = Math.max(max, tmp[k]);
                    dp[j + 1] = max + 1;
                }
            }
        }

        int answer = 0;
        for(int i = 0; i < dp.length; i++) answer = Math.max(answer, dp[i]);
        System.out.println(answer);

    }
}
