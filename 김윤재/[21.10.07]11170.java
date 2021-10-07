import java.util.*;

public class b_21_10_07_11170{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i< n; i++){
            int m = sc.nextInt();
            int p = sc.nextInt();
            int cnt = 0;
            for (int j = m; j < p+1; j++){
                String str = Integer.toString(j);
                for (int a = 0; a < str.length(); a++){
                    if (str.charAt(a) == '0'){
                        cnt += 1;
                    }
                }
            }
            System.out.println(cnt);
        }sc.close();
    }
}