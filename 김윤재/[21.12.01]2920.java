import java.util.*;

public class b_21_12_01_2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [8];
        for (int i =0; i < 8; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        if (arr[0] > arr[1]){
        for (int i = 0; i < 7; i++){
            if (arr[i] < arr[i+1]){
                System.out.println("mixed");
                cnt += 1;
                break;
            }
        }
        if (cnt != 1){
            System.out.println("descending");
        }
    }
        
        else if (arr[0] < arr[1]){
            for (int i = 0; i < 7; i++){
                if (arr[i] > arr[i+1]){
                    System.out.println("mixed");
                    cnt += 1;
                    break;
                }
            }
            if (cnt != 1){
                System.out.println("ascending");
            }
        }
    }
}
