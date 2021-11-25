package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar21 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        boolean status = true;

        for(int i = 0; i < N * 2; i++) {
            for(int j = 0; j < N; j++) {
                if(status) answer.append("*");
                else answer.append(" ");
                status = !status;
            }
            answer.append("\n");
            if(N % 2 == 0) status = !status;
        }

        System.out.println(answer);
    }
}
