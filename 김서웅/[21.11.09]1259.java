import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        StringBuffer sb = new StringBuffer();
        List aa = new ArrayList();
        String b;
        while(true) {
            a = Integer.parseInt(sc.nextLine());
            if(a == 0) {
                break;
            }
            else {
                aa.add(a);
            }
        }
        for(int i = 0; i < aa.size(); i++) {
            b = aa.get(i).toString();
            sb = new StringBuffer(b);
            if(aa.get(i).toString().equals(sb.reverse().toString())) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
