import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int temp = 0;
        int temp2 = 0;
        String temp3 = "";
        String[] line2 = new String[2];
        List line = new ArrayList();
        List answer = new ArrayList();

        for(int i = 0; i < num; i++) {
            temp = Integer.parseInt(sc.nextLine());
            for(int j = 0; j < temp; j++) {
                line2 = sc.nextLine().split(" ");
                line.add(line2[0]);
                line.add(line2[1]);
            }
            for(int j = 0; j < line.size(); j+=2) {
                if(temp2 < Integer.parseInt((String) line.get(j))) {
                    temp3 = (String) line.get(j+1);
                    temp2 = Integer.parseInt((String) line.get(j));
                }
            }
            answer.add(temp3);
            temp2 = 0;
            line.clear();
        }

        for(int i = 0; i < answer.size(); i++) {
            System.out.println((String) answer.get(i));
        }

    }
}
