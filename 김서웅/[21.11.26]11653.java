import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 2; i <= Math.sqrt(num); i++) {
            while(num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }

        if(num != 1) {
            System.out.println(num);
        }

    }
}
