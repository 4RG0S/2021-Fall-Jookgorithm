package ARGOS;
import java.util.*;

public class Sizee_7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 인원수
		sc.nextLine();
		int[][] x = new int[N][2];
		for(int i = 0; i < N; i++) {
			x[i][0] = sc.nextInt();
			x[i][1] = sc.nextInt();
		}
		sc.close();
		
		int[] ranking = new int[N];
		int rank = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j) {
					continue;
				}
				if(x[i][0] < x[j][0] && x[i][1] < x[j][1]) {
					rank++;
				}
			}
			ranking[i] = rank;
			rank = 1;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(ranking[i] + " ");
		}
		System.out.println();

	}
}
