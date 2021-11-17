import java.util.*;

public class b_21_11_17_13305 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] len_arr = new long[n-1];
        long[] oil_arr = new long[n-1];
        for (int i = 0; i < n-1; i++){
            len_arr[i] = sc.nextLong();
        }
        for (int i = 0; i < n-1; i++){
            oil_arr[i] = sc.nextLong();
        }
        long c = sc.nextLong();
        c=0;
        for(int i = 0; i < n - 1; i++){
            c += oil_arr[i]*len_arr[i];
            System.out.println(oil_arr[i]);
            for (int j = i+1; j < n - 1; j++){
                if (oil_arr[i] <= oil_arr[j]){
                    if (j == n-2){
                        c += oil_arr[i]*len_arr[j];
                        i = j;
                        break;
                    }
                    c += oil_arr[i]*len_arr[j];
                }
                else{
                    i = j-1;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}
