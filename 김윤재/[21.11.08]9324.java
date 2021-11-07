import java.util.*;

public class b_21_11_08_9324{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String str = sc.next();
            int cnt = 0;
            int [] arr = new int[30];
            for (int j = 0; j < str.length(); j++){
                arr[str.charAt(j) -'A'] += 1;
                if (arr[str.charAt(j) - 'A'] % 3 == 0){
                    if (j >= str.length()-1 || str.charAt(j+1) != str.charAt(j)){
                        System.out.println("FAKE");
                        cnt += 1;
                        break;
                    }
                    j += 1;
                }
            }
            if (cnt == 0){
            System.out.println("OK");
            }
        }
    }
}