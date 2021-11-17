package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Stock {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int loop = 0; loop < T; loop++) {
            int N = Integer.parseInt(br.readLine());
            int[] info = new int[N];
            String[] tmp = br.readLine().split(" ");
            for(int i = 0; i < N; i++) info[i] = Integer.parseInt(tmp[i]);
            long sum, count, max;
            long answer = 0L;
            sum = count = max = 0;
            for(int i = N - 1; i >= 0; i--) {
                if(info[i] > max) {
                    answer += max * count - sum;
                    max = sum = info[i];
                    count = 1;
                } else {
                    sum += info[i];
                    count++;
                }
            }
            answer += max * count - sum;
            System.out.println(answer);
        }

    }
}
