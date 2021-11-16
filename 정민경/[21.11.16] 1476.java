package ARGOS;
import java.util.*;

public class Date_1476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 1<=E<=15
		int b = sc.nextInt();; // 1<=S<=28
		int c = sc.nextInt();; // 1<=M<=19
		sc.close();
		int year = 0;
		
		while(true) {
			year++;
			if((year-a)%15 == 0 && (year-b)%28 == 0 && (year-c)%19 == 0) {
				System.out.println(year);
				break;
			}
		}
	}
}
