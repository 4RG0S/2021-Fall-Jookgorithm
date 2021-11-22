import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        Queue ans = new LinkedList();
        for(int i = 1; i <= a; i++) {
            ans.offer(i);
        }

        System.out.print(ans.poll()+" ");
        while(!ans.isEmpty()) {
            ans.offer(ans.poll());
            if(ans.size() == 1) {
                System.out.print(ans.poll());
            }
            else {
                System.out.print(ans.poll()+" ");
            }
        }

    }
}
