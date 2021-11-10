import java.util.*;
public class b_21_11_10_11866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> que = new LinkedList<Integer>();
        for (int i = 0; i < n; i++){
            que.add(i+1);
        }
        System.out.print("<");
        while (!que.isEmpty()){
            for (int i = 0; i < k-1; i++){
                que.add(que.poll());
            }
            if (que.size() == 1){
                System.out.print(que.poll());
                break;
            }
            System.out.print(que.poll() + ", ");
        }
        System.out.print(">");
    }
}
