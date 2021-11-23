import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String[] ans1 = Integer.toString(num1).split("");
        String[] ans2 = Integer.toString((num2)).split("");

        List a = Arrays.asList(ans1);
        List b = Arrays.asList(ans2);

        Collections.reverse(a);
        Collections.reverse(b);

        num1 = Integer.parseInt(String.join("", a));
        num2 = Integer.parseInt(String.join("", b));

        if(num1 > num2) {
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }

    }
}
