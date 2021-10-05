package ererer;

import java.util.*;

public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int a = Integer.parseInt(sc.nextLine());
	 int b = Integer.parseInt(sc.nextLine());
	 int c = Integer.parseInt(sc.nextLine());
	 int d = a*b*c;
	 String mul = Integer.toString(d);
	 
	 int[] arr = new int[mul.length()];
	 
	 for(int i = 0; i < mul.length(); i++) {
		 arr[i] = mul.charAt(i) - '0';
	 }
	 
	 int[] num = new int[10];
	 int[] ans = new int[10];
	 for(int j = 0; j < 10; j++) {
		 num[j] = j;
		 ans[j] = 0;
	 }
	 
	 for(int k = 0; k < mul.length(); k++) {
		 for(int l = 0; l < 10; l++) {
			 if(arr[k] == num[l]) {
				 ans[l] = ans[l] + 1;
			 }
		 }
	 }
	 
	 for(int m = 0; m < 10; m++) {
		 System.out.println(ans[m]);
	 }
	 
 }
}

