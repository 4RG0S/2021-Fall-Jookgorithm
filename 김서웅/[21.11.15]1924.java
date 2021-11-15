import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int temp = 0;

        for(int i = 1; i < month; i++) {
            if(i < 8) {
                if(i == 2) {
                    temp = temp + 28;
                }
                else if(i % 2 == 0) {
                    temp = temp + 30;
                }
                else if(i % 2 == 1) {
                    temp = temp + 31;
                }
            }
            else {
                if(i % 2 == 0) {
                    temp = temp + 31;
                }
                else {
                    temp = temp + 30;
                }
            }

        }
        temp = temp + day;
        if(temp % 7 == 0) {
            System.out.println("SUN");
        }
        else if(temp % 7 == 1) {
            System.out.println("MON");
        }
        else if(temp % 7 == 2) {
            System.out.println("TUE");
        }
        else if(temp % 7 == 3) {
            System.out.println("WED");
        }
        else if(temp % 7 == 4) {
            System.out.println("THU");
        }
        else if(temp % 7 == 5) {
            System.out.println("FRI");
        }
        else if(temp % 7 == 6) {
            System.out.println("SAT");
        }


    }
}
