package baekjoon;

import java.util.Scanner;

public class SangSuReadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] A = scanner.next().toCharArray();
        char[] B = scanner.next().toCharArray();

        int status = 0;

        for(int i = 2; i >= 0; i--) {
            if(status == 0) {
                if(A[i] > B[i]) {
                    System.out.print(A[i] - 48);
                    status = 1;
                } else if(A[i] < B[i]) {
                    System.out.print(B[i] - 48);
                    status = -1;
                } else {
                    System.out.print(A[i] - 48);
                }
            } else if(status == 1) {
                System.out.print(A[i] - 48);
            } else {
                System.out.print(B[i] - 48);
            }
        }
    }
}
