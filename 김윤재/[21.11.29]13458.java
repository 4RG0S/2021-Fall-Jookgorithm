import java.util.*;

public class b_21_11_29_13458{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < a; i++){
            
            arr[i] -= b;
            cnt += 1;
            if (arr[i] <= 0){
                continue;
            }
            if (arr[i] % c == 0){
                cnt += arr[i] / c;
            }
            else if (arr[i] % c != 0){
                cnt += arr[i] / c + 1;
            }
        }
        System.out.println(cnt);
    }
}