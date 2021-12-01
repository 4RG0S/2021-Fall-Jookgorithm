import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        int[] c = new int[5];
        for(int i = 0; i < 5; i++) {
            int a = Integer.parseInt(sc.nextLine());
            c[i] = a;
            b = b + a;
        }

        Arrays.sort(c);

        System.out.println(b/5);
        System.out.println(c[2]);
    }
}
