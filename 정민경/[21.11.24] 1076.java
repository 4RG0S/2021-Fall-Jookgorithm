package ARGOS;
import java.util.*;

public class Resistance_1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> resist = new HashMap<>();
		resist.put("black", "0, 1");
		resist.put("brown", "1, 10");
		resist.put("red", "2, 100");
		resist.put("orange", "3, 1000");
		resist.put("yellow", "4, 10000");
		resist.put("green", "5, 100000");
		resist.put("blue", "6, 1000000");
		resist.put("violet", "7, 10000000");
		resist.put("grey", "8, 100000000");
		resist.put("white", "9, 1000000000"); 
		
		String str = "";
		String[][] value = new String[3][2];
		for(int i = 0; i < 3; i++) {
			str = sc.next();
			value[i] = resist.get(str).split(", ");
		}
		
		String a = "";
		for(int i = 0; i < 2; i++) {
			a += value[i][0];
		}
		
		
		Long result = Long.parseLong(a) * Long.parseLong(value[2][1]);
		System.out.println(result);
		
	}
}
