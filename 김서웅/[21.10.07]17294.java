import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int first;
        int second;
        int answer;
        Boolean type = true;

        if(num.length() == 1) {
            answer = 0;
        }
        else {
            first = Integer.parseInt(String.valueOf(num.charAt(0)));
            second = Integer.parseInt(String.valueOf(num.charAt(1)));
            answer = first - second;
        }


        for(int i = 1; i < num.length() - 1; i++){
            first = Integer.parseInt(String.valueOf(num.charAt(i)));
            second = Integer.parseInt(String.valueOf(num.charAt(i+1)));
            if(answer != (first - second)) {
                type = false;
            }
            answer = first - second;
        }
        if(type == true) {
            System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
        }
        else {
            System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
        }
        sc.close();
    }
}
