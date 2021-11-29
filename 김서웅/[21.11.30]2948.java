import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int sum = 0;

        for(int i = 1; i < month; i++) {
            if(month == 1) {
                break;
            }
            else if(i < 8) {
                if(i == 2) {
                    sum = sum + 28;
                }
                else if(i % 2 == 0) {
                    sum = sum + 30;
                }
                else {
                    sum = sum + 31;
                }
            }
            else {
                if(i % 2 == 0) {
                    sum = sum + 31;
                }
                else {
                    sum = sum + 30;
                }
            }
        }

        sum = sum + day;

        if(sum % 7 == 1) {
            System.out.println("Thursday");
        }
        else if(sum % 7 == 2) {
            System.out.println("Friday");
        }
        else if(sum % 7 == 3) {
            System.out.println("Saturday");
        }
        else if(sum % 7 == 4) {
            System.out.println("Sunday");
        }
        else if(sum % 7 == 5) {
            System.out.println("Monday");
        }
        else if(sum % 7 == 6) {
            System.out.println("Tuesday");
        }
        else if(sum % 7 == 0) {
            System.out.println("Wednesday");
        }


    }
}
