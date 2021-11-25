package ARGOS;
import java.util.Scanner;

public class BABBA_9625 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		sc.close();
		
		for(int i = 1; i < k; i++) {
			sum = a+b;
			a = b;
			b = sum;
		}
		
		System.out.println(a + " " + b);
	}
}
