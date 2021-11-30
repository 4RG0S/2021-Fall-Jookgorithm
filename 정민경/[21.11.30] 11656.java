package ARGOS;
import java.io.*;
import java.util.*;

public class Tail_11656 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int length = str.length();
		String[] result = new String[length];
		for(int i = 0; i < length; i++) {
			result[i] = str.substring(i);
		}
		
		Arrays.sort(result);
		
		for(int i = 0; i < length; i++) {
			System.out.println(result[i]);
		}
	}
}
