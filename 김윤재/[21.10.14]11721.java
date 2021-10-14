import java.util.*;
public class b_21_10_14_11721 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        while(true){
            if (str.length() >= 10*(i+1)){
            System.out.println(str.substring(10*i, 10*(i+1)));
        }
        else{
            System.out.println(str.substring(10*i));
            break;
        }
        i += 1;
    }

    }
}
