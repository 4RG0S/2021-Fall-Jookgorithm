package baekjoon;

import java.util.Scanner;

public class PrintTenCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] a = scanner.nextLine().toCharArray();

        for(int i = 0; i < a.length; i++) {
            if(i % 10 == 0 && i != 0) System.out.println();
            System.out.print(a[i]);
        }

    }
}
