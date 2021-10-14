import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List name = new LinkedList();
        List inc = new LinkedList();
        List dec = new LinkedList();
        String temp;

        int num = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < num; i++) {
            temp = sc.nextLine();
            name.add(temp);
            inc.add(temp);
            dec.add(temp);
        }
        Collections.sort(inc);
        Collections.sort(dec);
        Collections.reverse(dec);

        String[] name1 = (String[]) name.toArray(new String[name.size()]);
        String[] inc1 = (String[]) inc.toArray(new String[inc.size()]);
        String[] dec1 = (String[]) dec.toArray(new String[dec.size()]);


        if(Arrays.equals(name1, inc1)) {
            System.out.println("INCREASING");
        }
        else if(Arrays.equals(name1, dec1)) {
            System.out.println("DECREASING");
        }
        else {
            System.out.println("NEITHER");
        }

        sc.close();
    }
}
