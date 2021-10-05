import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        double num2 = 0;
        double num3 = 0;

        String[] a = sc.nextLine().split(" ");
        Double[] numarr = new Double[num];
        for(int i = 0; i < a.length; i++) {
            numarr[i] = (double) Integer.parseInt(a[i]);
        }

        num2 = numarr[0];
        for(int j = 0; j < numarr.length; j++) {
            if(num2 < numarr[j]) {
                num2 = numarr[j];
            }
        }

        for(int k = 0; k < numarr.length; k++) {
            num3 = Math.round(((double) numarr[k] / (double) num2 * 100) * 100000.0) / 100000.0;
            numarr[k] = num3;
        }
        num2 = 0;

        for(int l = 0; l < numarr.length; l++) {
            num2 = num2 + numarr[l];
        }

        System.out.println(num2 / numarr.length);



    }
}
