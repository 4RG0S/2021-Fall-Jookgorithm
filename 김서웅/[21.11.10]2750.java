import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int c;
        HashSet b = new HashSet();
        for(int i = 0; i < a; i++) {
            c = Integer.parseInt(sc.nextLine());
            b.add(c);
        }
        List d = new ArrayList(b);
        Collections.sort(d);

        for(int i = 0; i < d.size(); i++) {
            System.out.println(d.get(i).toString());
        }

    }
}
