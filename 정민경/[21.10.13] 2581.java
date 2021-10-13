package ARGOS;

import java.util.*;

public class prime_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); // M이상
		int N = sc.nextInt(); // N이하
		int min = N;
		int sum = 0;
		
		boolean[] arr = new boolean[N+1];
		
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(N+1); i++) {
			for(int j = i*i; j < N+1; j += i) {
				arr[j] = true;
			}
		}
		
		for(int i = M; i < N+1; i++) {
			if(arr[i] == false) {
				if(i <= min) {
					min = i;
				}
				sum += i;
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		sc.close();
	}
}
