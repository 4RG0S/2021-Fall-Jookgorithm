package baekjoon;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();
        result *= scanner.nextInt();
        result *= scanner.nextInt();

        int[] answer = new int[10];
        char[] s = Integer.toString(result).toCharArray();

        for(int i = 0; i < s.length; i++) answer[s[i] - 48]++;

        for(int i = 0; i < 10; i++) System.out.println(answer[i]);
    }
}
