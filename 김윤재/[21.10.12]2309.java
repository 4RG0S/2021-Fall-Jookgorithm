import java.util.*;

public class b_21_10_12_2309{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [9];
        int a =0;
        int b =0;
        for (int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < 9; i++){
            sum += arr[i];
        }
        sum -= 100;
        for (int i = 0; i < 9; i++){
            for (int j = i+1; j < 9; j++){
                if (arr[i] + arr[j] == sum){
                    a = arr[i];
                    b = arr[j];
                    break;
                }
            }
            if (a != 0 && b != 0){
                break;
            }
        }
        for (int i = 0; i < 9; i++){
            if (arr[i] == a || arr[i] == b){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}