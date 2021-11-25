import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = input.length;

        for(int i = 0; i < input.length; i++) {
            if(input[i].equals("")) {
                a--;
            }
        }

        System.out.println(a);

    }
}
