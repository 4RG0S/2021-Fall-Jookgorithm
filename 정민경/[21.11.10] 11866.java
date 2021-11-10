package ARGOS;
import java.util.*;

public class Queue_11866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		for(int i = 0; i < N; i++) {
			queue.add(i+1);
		}
		
		int size = queue.size() - 1;
		for(int i = 0; i < size; i++) {
			for(int j = 1; j < K; j++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll());
			sb.append(", ");
		}
		sb.append(queue.poll());
		sb.append(">");
		
		System.out.println(sb);
		sc.close();
	}
}
