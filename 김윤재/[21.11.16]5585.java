import java.util.*;
public class b_21_11_16_5585 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = 1000 - n;
        int k = 0;
        if (n >= 500){
            k += n / 500;
            n %= 500;
        }
        if (n >= 100){
            k += n / 100;
            n %= 100;
        }
        if (n >= 50){
            k += n / 50;
            n %= 50;
        }
        if (n >= 10){
            k += n / 10;
            n %= 10;
        }
        if (n >= 5){
            k += n / 5;
            n %= 5;
        }
        k += n;
        System.out.println(k);
    }
}
