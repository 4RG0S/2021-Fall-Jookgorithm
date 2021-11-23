package ARGOS;
import java.util.*;

public class MovieScore_23278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 총 인원수
		int L = sc.nextInt(); // 낮은 L개의 점수
		int H = sc.nextInt(); // 높은 H개의 점수
		int[] score = new int[N];
		
		for(int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(score);
		
		double sum = 0;
		for(int i = L; i < N-H; i++) {
			sum += score[i];
		}
		
		
		System.out.println(sum/(N-H-L));

	}
}
