package ARGOS;
import java.util.Scanner;
public class Find_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		sc.close();
		int n = 0;
		int count = 0;
		while(true) {
			n++;
			count += n;
			if(count >= number) {
				if(n % 2 != 0) {
					System.out.println((count-number+1) + "/" + (number-count+n));
				}
				else {
					System.out.println((number-count+n) + "/" +(count-number+1));
				}
				break;
			}
		}
	}
}
