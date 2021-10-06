package ARGOS;

import java.util.Scanner;

public class word_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; //알파벳의 개수 26개
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) { //대문자일 때
			if(str.charAt(i) > 64 && str.charAt(i) < 91) {
				arr[str.charAt(i) - 'A']++;
			}
			else { //소문자일 때
				arr[str.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < 26; i++) { 
			if(max < arr[i]) {
				max = arr[i];
				ch = (char)(i + 'A');
			}
			else if(max == arr[i]) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
		sc.close();
	}
}
