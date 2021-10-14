package ARGOS;
import java.util.*;

public class score_2822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[8];
		int[] compare = new int[8];
		int sum = 0;
		ArrayList<String> result = new ArrayList<>();
		
		for(int i = 0; i < 8; i++) {
			score[i] = sc.nextInt();
			compare[i] = score[i];
		}
		
		Arrays.sort(score);
		
		for(int i = 3; i < 8; i++) {
			sum += score[i];
			for(int j = 0; j < 8; j++) {
				if(score[i] == compare[j]) {
					result.add(Integer.toString(j + 1));
					break;
				}
				else {
					continue;
				}
			}
		}
		
		Collections.sort(result);
		
		System.out.println(sum);
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}	
		sc.close();
	}
}
