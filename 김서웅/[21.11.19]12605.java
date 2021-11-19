import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        List b = new ArrayList();
        String temp = "";
        for(int i = 0; i < num; i++) {
            String[] a = sc.nextLine().split(" ");
            temp = "Case #"+Integer.toString(i+1)+": ";
            for(int j = a.length-1; j > -1; j--) {
                if(j == 0) {
                    temp = temp + a[j];
                }
                else {
                    temp = temp + a[j]+" ";
                }
            }
            b.add(temp);
            temp = "";
        }

        for(int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i).toString());
        }
    }
}
