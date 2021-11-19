package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Garosu {

    static int gcd(int a, int b) {
        if(b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) - 1;
        int[] d = new int[N];
        int t1 = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int t2 = Integer.parseInt(br.readLine());
            d[i] = t2 - t1;
            t1 = t2;
        }
        int g = gcd(d[0], d[1]);
        for(int i = 2; i < N; i++) {
            g = gcd(g, d[i]);
            if(g == 1) break;
        }
        int answer = 0;
        for(int i = 0; i < N; i++) answer += (int)(d[i] / g) - 1;
        System.out.println(answer);
    }
}
