package ARGOS;
import java.util.*;

public class Sortinside_1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split("");
		sc.close();
		int N = str.length;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(str[i]));
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		
		
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println();
	}
}
