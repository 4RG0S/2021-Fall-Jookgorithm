package ARGOS;
import java.util.*;
import java.io.*;

public class No_1764 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]); //듣도못한 사람수
		int M = Integer.parseInt(input[1]); //보도못한 사람수
		HashSet<String> liname = new HashSet<>();
		ArrayList<String> name = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			liname.add(br.readLine());
		}
		for(int i = 0; i < M; i++) {
			String str = br.readLine();
			if(liname.contains(str)) {
				name.add(str);
			}
		}
		
		Collections.sort(name);
		int size = name.size();
		System.out.println(size);
		for(int i = 0; i < size; i++) {
			System.out.println(name.get(i));
		}
	}
}
