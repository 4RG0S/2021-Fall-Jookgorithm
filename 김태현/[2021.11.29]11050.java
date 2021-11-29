package baekjoon;

import java.util.Scanner;

public class BinomialCoefficient1 {

    static int factorial(int n) {
        if(n == 0) return 1;
        if(n <= 2) return n;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));

    }
}
