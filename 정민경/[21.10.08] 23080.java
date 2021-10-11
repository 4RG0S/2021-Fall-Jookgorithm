package ARGOS;

import java.util.Scanner;

public class Scytale_23080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		for(int i = 0; i < arr.length; i+=N) {
			System.out.print(arr[i]);
		}
		
		sc.close();
	}
}
