import java.util.*;
public class b_21_11_22_11727 {
    static int dp[] = new int [1001];
    
    public static int dp_tyle(int n){
        if (n == 1){
            return 1;
        }
        else if (n == 2){
            return 3;
        }
        if (dp[n] != 0){
            return dp[n];
        }
        else{
            dp[n] = dp_tyle(n-1) + 2*dp_tyle(n-2);
            return dp[n];
        }
    }
    public static void main(String[] args){
        dp[1] = 1;
        dp[2] = 3;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(dp_tyle(n));
    }
}
