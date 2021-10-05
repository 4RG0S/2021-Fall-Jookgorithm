package ARGOS;

import java.util.*;

public class average_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //테스트 갯수
		int k = 0; // 각 테스트별 점수의 수
		int sum = 0; // 각 테스트별 점수의 합
		double avg = 0; // 평균
		int count = 0; // 평균이 넘는 횟수
		
		for(int i = 0; i < N; i++) {
			k = 0;
			sum = 0;
			count = 0;
			avg = 0;
			k = sc.nextInt();
			int[] score = new int[k];
			for(int j = 0; j < k; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avg = (double)sum / (double)k;
			for(int j = 0; j < k; j++) {
				if(score[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", 100.0 * count / k );
			System.out.println("%");
		}
		sc.close();
	}
}
