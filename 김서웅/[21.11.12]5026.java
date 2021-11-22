import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int temp = 0;
        List ans = new ArrayList();
        for(int i = 0; i < num; i++) {
            String b = sc.nextLine();
            if(b.equals("P=NP")) {
                ans.add("skipped");
            }
            else {
                String[] c = b.split("\\+");
                ans.add(Integer.parseInt(c[0]) + Integer.parseInt(c[1]));
            }

        }
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i).toString());
        }
    }
}
