import java.util.*;
public class b_21_11_22_5988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String str = sc.next();
            int a = str.charAt(str.length()-1) - '0';
            if (a % 2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
}
