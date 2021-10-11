import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        List aa = new ArrayList();

        for(int i = 0; i < num.length(); i++) {
            aa.add(num.charAt(i));
        }
        Collections.sort(aa);
        Collections.reverse(aa);

        for(int i = 0; i < aa.size(); i++) {
            System.out.print(aa.get(i));
        }
        System.out.println();

        sc.close();
    }
}
