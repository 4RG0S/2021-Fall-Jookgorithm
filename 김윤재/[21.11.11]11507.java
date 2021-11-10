import java.util.*;
public class b_21_11_11_11507 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str_arr = new String[str.length()/3];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < str.length()/3; i++){
            str_arr[i] = str.substring(3*i, 3*(i+1));
        }
        HashSet<String> set = new HashSet<String>(Arrays.asList(str_arr));
        if (set.size() != str_arr.length){
            System.out.println("GRESKA");
        }
        else{
            for (int i = 0; i < str_arr.length; i++){
                if (str_arr[i].charAt(0) == 'P'){
                    a += 1;
                }
                else if (str_arr[i].charAt(0) == 'K'){
                    b += 1;
                }
                else if (str_arr[i].charAt(0) == 'H'){
                    c += 1;
                }
                else if (str_arr[i].charAt(0) == 'T'){
                    d += 1;
                }

            }
            a = 13-a;
            b = 13-b;
            c = 13-c;
            d = 13-d;
            System.out.print(a+" ");
            System.out.print(b+ " ");
            System.out.print(c+ " ");
            System.out.print(d);
        }
    }
}
