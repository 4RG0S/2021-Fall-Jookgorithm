package baekjoon;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String[] tmp = scanner.nextLine().split("");
        int answer = 0;
        for(int i = 0; i < N; i++) answer += Integer.parseInt(tmp[i]);

        System.out.println(answer);
    }
}
