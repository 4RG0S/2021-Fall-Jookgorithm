import java.util.*;
public class b_21_10_06_2331 {
    public static int same(int [] arr){
        int cnt = 0;
        int f = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                break;
            }
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j+1]){
                    cnt += 1;
                    f = i;
                    if (f == 0){
                        f = -1;
                    }
                    return f;
                }
                if (arr[j] == 0){
                    break;
                }
            }
            if (cnt == 1){
                return f;
            }
        }
        return cnt;
    }
    public static int p_mul(int q, int p){
        int k = q;
        for (int i = 0; i < p-1; i++){
            k *= q;
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = sc.nextInt();
        int [] arr = new int [10000];
        arr[0] = a;
        int t = 1;
        while(true){
        if (same(arr) != 0){
            if (same(arr) == -1){
                System.out.println(0);
            }
            else{
            System.out.println(same(arr));
            }
            break;
        }
        int v = 0;
        String str = Integer.toString(arr[t-1]);
        for (int i = 0; i < str.length(); i++){
            int w = str.charAt(i) - '0';
            v += p_mul(w, p);
        }
        arr[t] = v;
        t += 1;
    }
    }
}

