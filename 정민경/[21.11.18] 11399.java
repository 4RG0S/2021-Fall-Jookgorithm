package ARGOS;
import java.util.*;

public class ATM_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 인원수
		sc.nextLine();
		String[] str = sc.nextLine().split(" "); // 걸리는 시간
		sc.close();
		
		int[] arr = new int[N];
		int n = N;
		int sum = 0; // 최종 걸리는 시간의 합
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		for(int i = 0; i < N; i++) {
			sum += arr[i]*n;
			n--;
		}
		System.out.print(sum);

	}
}
