import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();
        long answer = 0;
        String middle = "";


        for(int i = 0; i < color.length; i++) {
            if(first.equals(color[i])) {
                middle = Integer.toString(i);
            }
        }
        for(int i = 0; i < color.length; i++) {
            if(second.equals(color[i])) {
                middle = middle + Integer.toString(i);
            }
        }
        for(int i = 0; i < color.length; i++) {
            if(third.equals(color[i])) {
                answer = (long) Math.pow(10, i) * Integer.parseInt(middle);
            }
        }

        System.out.println(answer);
        sc.close();
    }

}
