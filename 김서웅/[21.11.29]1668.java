import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] line = new int[num];
        int temp = 0;
        int first = 0;
        int back = 0;
        for(int i = 0; i < num; i++) {
            int a = Integer.parseInt(sc.nextLine());
            line[i] = a;
            if(temp < line[i]) {
                first++;
                temp = line[i];
            }
        }
        temp = 0;
        for(int i = num-1; i >= 0; i--) {
            if(temp < line[i]) {
                back++;
                temp = line[i];
            }
        }

        System.out.println(first);
        System.out.println(back);
    }
}
