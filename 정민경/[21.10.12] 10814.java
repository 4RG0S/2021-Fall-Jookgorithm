package ARGOS;
import java.util.*;

public class agesort_10814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[][] arr = new String[N][2];
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] str1, String[] str2) {
				return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]);
			}
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		sc.close();
	}
}
