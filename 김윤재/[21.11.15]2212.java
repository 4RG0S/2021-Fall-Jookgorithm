import java.util.*;
public class b_21_11_15_2212 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] ans_arr = new int[n-1];
        for (int i = 0; i < n-1; i++){
            ans_arr[i] = arr[i+1]-arr[i];
        }
        Arrays.sort(ans_arr);
        long sum = 0;
        for (int i = 0; i < n - 1; i++){
            sum += ans_arr[i];
        }
        for (int i = 0; i < k - 1; i++){
            sum -= ans_arr[n-2-i];
        }
        if (n <= k){
            System.out.println(0);
        }
        else{
            System.out.println(sum);
        }
    }
}
