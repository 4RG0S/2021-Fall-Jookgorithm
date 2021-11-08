import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] b = sc.nextLine().split(" ");
        HashSet a = new HashSet();

        for(int i = 0; i < b.length; i++) {
         a.add(Integer.parseInt(b[i]));
        }
        List lis = new ArrayList(a);
        Collections.sort(lis);

        for(int i = 0; i < lis.size()-1; i++) {
            System.out.print(lis.get(i) + " ");
        }
        System.out.print(lis.get(lis.size()-1));

    }
}
