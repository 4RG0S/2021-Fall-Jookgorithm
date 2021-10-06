package ARGOS;

import java.util.Scanner;

public class common_multiple_1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //줄수
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a > b ? a : b;
			int d = a < b ? a : b;
			
			for(int j = 1; j <= d; j++ ) {
				if((c * j) % d == 0) {
					System.out.println(c * j);
					break;
				}
			}
		}
		
		sc.close();
	}

}
