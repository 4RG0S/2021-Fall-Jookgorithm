import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = Integer.parseInt(sc.nextLine());
        long answer = 0;
        long temp = 0;
        String[] a = sc.nextLine().split(" ");
        for(int i = 0; i < num-1; i++) {
            temp = temp + Integer.parseInt(a[i]);
            answer = answer + (temp * Integer.parseInt(a[i+1]));
        }

        System.out.println(answer);
    }
}
