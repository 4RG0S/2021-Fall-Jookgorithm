import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] before = new int[8];
        ArrayList<Integer> after = new ArrayList<>();
        int temp;

        for(int i = 0; i < 8; i++) {
            temp = Integer.parseInt(sc.nextLine());
            after.add(temp);
            before[i] = temp;
        }
        Collections.sort(after);
        Collections.reverse(after);

        temp = 0;
        for(int i = 0; i < 5; i++) {
            temp = temp + after.get(i);
        }
        System.out.println(temp);
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 5; j++) {
                if(after.get(j) == before[i]) {
                    System.out.print(i+1);
                    System.out.print(" ");
                }
            }
        }
        sc.close();
    }
}
