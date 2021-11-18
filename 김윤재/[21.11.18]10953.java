import java.util.*;
public class b_21_11_18_10953 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        for (int i = 0; i< n; i++){
            String[] str = sc.nextLine().split(",");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(a + b);
        }
    }
}
