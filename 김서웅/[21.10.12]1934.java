import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int num2, num3;
        List ans = new ArrayList();
        String [] numlist = new String[2];
        int arg = 0;

        for(int i = 0; i < num; i++) {
            numlist = sc.nextLine().split(" ");
            num2 = Integer.parseInt(numlist[0]);
            num3 = Integer.parseInt(numlist[1]);

            if(num2 < num3){
                arg = num3;
                while(true) {
                    if(num3 % num2 == 0) {
                        ans.add(num3);
                        break;
                    }
                    num3 = num3 + arg;
                }
            }
            else if(num2 > num3){
                arg = num2;
                while(true) {
                    if(num2 % num3 == 0) {
                        ans.add(num2);
                        break;
                    }
                    num2 = num2 + arg;
                }
            }
            else if(num2 == num3) {
                ans.add(num2);
            }

        }
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

        sc.close();
    }
}
