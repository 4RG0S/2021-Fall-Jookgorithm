import java.util.*;
public class b_21_11_25_1057 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp = 0;
        if (a > b){
            tmp = b;
            b = a;
            a = tmp;
        }
        int cnt = 1;
        int k = 0;
        int alpha = 1;
        int beta = 2;
        int temp = beta;
        while (true) {
            if (k == 1) {
                k = 0;
                cnt += 1;
                beta = temp * 2;
                temp = beta;
                alpha = 1;
            }
            if (alpha <= a && a <= beta) {
                if (alpha <= b && b <= beta) {
                    System.out.println(cnt);
                    break;
                }
            }
            if (beta + temp > n){
                beta = n;
                alpha += temp;
                if (alpha <= a && a <= beta) {
                    if (alpha <= b && b <= beta) {
                        System.out.println(cnt);
                        break;
                    }
                }
                k += 1;
            }
            else{
                alpha += temp;
                beta += temp;
            }
            }
    }

}
