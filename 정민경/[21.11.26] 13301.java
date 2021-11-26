package ARGOS;
import java.util.Scanner;

public class tile_13301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		long[] fibbo = new long[81];
		long[] result = new long[81];
		fibbo[0] = 0; fibbo[1] = 1; fibbo[2] = 1;
		result[0] = 0;
		
		if(N > 2) {
			for(int i = 3; i <= N; i++) {
				fibbo[i] = fibbo[i-1] + fibbo[i-2];
			}
		}
		
		result[1] = 4;
		for(int i = 2; i <= N; i++) {
			result[i] = result[i-1] + fibbo[i]*2;
		}
		System.out.println(result[N]);

	}
}
