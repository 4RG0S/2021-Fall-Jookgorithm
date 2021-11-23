import java.util.*;
public class b_21_11_24_11050 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long a = 1;
        for (int i = 0; i < k; i++){
            a *= (n-i);
        }
        long b = 1;
        for (int i  = 1; i < k+1; i++){
            b *= i;
        }
        System.out.println(a/b);
    }
}
