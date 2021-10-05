import java.util.*;
public class b_21_10_05_2164 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i < n+1; i++){
            queue.add(i);
        }
        while(true){
            if (queue.size() == 1){
                System.out.println(queue.poll());
                break;
            }
            else{
                queue.poll();
                if(queue.size() == 1){
                    System.out.println(queue.poll());
                    break;
                }
                queue.add(queue.poll());
            }
        }
    }
}
