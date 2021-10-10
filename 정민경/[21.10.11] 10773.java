package ARGOS;
import java.util.*;

public class zero1_10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int K = sc.nextInt(); // 줄수
		Stack<Integer> stack = new Stack<Integer>();
		int result = 0;
		
		for(int i = 0; i < K; i++) {
			int N = sc.nextInt();
			if(N != 0) {
				stack.push(N);
			}
			else {
				stack.pop();
			}
		}
		if(stack.size() == 0) {
			System.out.println(0);
		}
		else {
			for(int i = 0; i < stack.size(); i++) {
				result += stack.get(i);
			}
			System.out.println(result);
		}
		sc.close();
	}
}
