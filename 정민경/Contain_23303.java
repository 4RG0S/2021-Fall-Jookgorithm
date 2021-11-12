package ARGOS;
import java.util.*;

public class Contain_23303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		if(str.contains("D2") || str.contains("d2")) {
			System.out.println("D2");
		}
		else {
			System.out.println("unrated");
		}
		
		sc.close();
	}
}
