import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue queue = new LinkedList();
        ArrayList answer = new ArrayList();

        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()) {
            for(int i = 0; i < k-1; i++) {
                queue.offer(queue.poll());
            }
            answer.add(queue.poll());
        }

        System.out.print("<");
        for(int i = 0; i < answer.size(); i++) {
            if(i == answer.size()-1) {
                System.out.print(Integer.parseInt(answer.get(i).toString()));
            }
            else {
                System.out.print(Integer.parseInt(answer.get(i).toString()) + ", ");
            }
        }
        System.out.print(">");

    }
}
