package ARGOS;

import java.util.*;

public class WordSorting_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] arr = new String[N];
		int len1 = 0;
		int len2 = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		
		// 길이순으로 정렬
		Arrays.sort(arr, new Comparator<String>() { 
			@Override
			public int compare(String a, String b) {
				return Integer.compare(a.length(), b.length());
			}
		});
		
		// 같은 길이 내 사전순 정렬
		int j;
		for(int i = 0; i < N; i++) {
			len1 = arr[i].length();
			for(j = i+1; j < N; j++) {
				len2 = arr[j].length();
				
				if(len1 != len2) {
					break;
				}
			}
			Arrays.sort(arr, i, j);
			i = j-1;
		}
		
		System.out.println(arr[0]);
		for(int i = 1; i < N; i++) {
			if(arr[i-1].equals(arr[i])) {
				continue;
			}
			System.out.println(arr[i]);
		}	
		sc.close();
	}
}
