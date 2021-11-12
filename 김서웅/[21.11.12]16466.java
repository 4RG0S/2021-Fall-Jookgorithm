import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int[] b = new int[a];
        int c;
        for(int i = 0; i < a; i++) {
            c = sc.nextInt();
            b[i] = c;
        }
        Arrays.sort(b);
        int d = b[a-1] + 1;
        for(int i = 1; i <= b[a-1]; i++) {
            if(b[i-1] != i) {
                d = i;
                break;
            }
        }
        System.out.println(d);
    }
}
