import java.util.*;
public class b_21_10_13_1076 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[10][3];
        arr[0][0] = "black";
        arr[1][0] = "brown";
        arr[2][0] = "red";
        arr[3][0] = "orange";
        arr[4][0] = "yellow";
        arr[5][0] = "green";
        arr[6][0] = "blue";
        arr[7][0] = "violet";
        arr[8][0] = "grey";
        arr[9][0] = "white";
        arr[0][2] = "1";
        for (int i = 0; i < 10; i++){
            arr[i][1] = Integer.toString(i);
            arr[i][2] = "";
            for (int j = 0; j < i; j++){
                arr[i][2] += "0";
            }
        }
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String int_str = "";

        for (int i = 0; i < 10; i++){
            if (arr[i][0].equals(str)){
                if(str.equals("black")){
                    break;
                }
                int_str += arr[i][1];
                break;
            }
        }
        for (int i = 0; i < 10; i++){
            if (arr[i][0].equals(str1)){
                if (int_str.equals("") && str1.equals("black")){
                    break;
                }
                int_str += arr[i][1];
                break;
            }
        }
        for (int i = 0; i < 10; i++){
            if (arr[i][0].equals(str2)){
                if (str2.equals("black")){
                    break;
                }
                int_str += arr[i][2];
                break;
            }
        }
        if (str.equals("black") && str1.equals("black")){
            System.out.println(0);
        }
        
        else{
        System.out.println(int_str);
        }
    }
}
