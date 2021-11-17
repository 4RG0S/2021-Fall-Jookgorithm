package ARGOS;
import java.util.*;

public class Easy_1292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrli = new ArrayList<>();
		
		int num = 1;
		int count = 0;
		for(int i = 0; i < 1000; i++) {
			arrli.add(num);
			count++;
			if(num == count) {
				num++;
				count = 0;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 시작수
		int B = sc.nextInt(); // 끝수 
		sc.close();
		
		int sum = 0;
		for(int i = A - 1; i < B; i++) {
			sum += arrli.get(i);
		}
		System.out.println(sum);
	}
}
