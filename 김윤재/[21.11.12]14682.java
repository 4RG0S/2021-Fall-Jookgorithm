import java.util.*;
public class b_21_11_12_14682 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] o_arr = new String[9];
        String[] s_arr = new String[9];
        o_arr = sc.nextLine().split(" ");
        s_arr = sc.nextLine().split(" ");
        int[] io_arr = new int [9];
        int[] is_arr = new int[9];

        for (int i = 0; i < 9; i++){
            io_arr[i] = Integer.parseInt(o_arr[i]);
            is_arr[i] = Integer.parseInt(s_arr[i]);
        }
        int o_sum = 0;
        int s_sum = 0;
        int cnt = 0;
        for (int i = 0; i < 9; i++){
            o_sum += io_arr[i];
            s_sum += is_arr[i];
            if (o_sum > s_sum){
                cnt += 1;
            }
        }
        if (s_sum > o_sum){
            if (cnt >= 1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
