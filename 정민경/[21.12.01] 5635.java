package ARGOS;
import java.io.*;

public class Birth_5635 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 인원수
		String[] name = new String[N];
		int[] day = new int[N];
		int[] month = new int[N];
		int[] year = new int[N];
		int temp = 0;
		String tmp = "";
		
		for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			name[i] = str[0];
			day[i] = Integer.parseInt(str[1]);
			month[i] = Integer.parseInt(str[2]);
			year[i] = Integer.parseInt(str[3]);
			
		}
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(year[i] == year[j]) {
					if(month[i] == month[j]) {
						if(day[i] > day[j]) {
							temp = day[i];
							day[i] = day[j];
							day[j] = temp;
							tmp = name[i];
							name[i] = name[j];
							name[j] = tmp;
						}
					}
					else if(month[i] > month[j]) {
						temp = day[i];
						day[i] = day[j];
						day[j] = temp;
						temp = month[i];
						month[i] = month[j];
						month[j] = temp;
						tmp = name[i];
						name[i] = name[j];
						name[j] = tmp;
					}
				}
				else if(year[i] > year[j]) {
					temp = day[i];
					day[i] = day[j];
					day[j] = temp;
					temp = month[i];
					month[i] = month[j];
					month[j] = temp;
					temp = year[i];
					year[i] = year[j];
					year[j] = temp;
					tmp = name[i];
					name[i] = name[j];
					name[j] = tmp;
				}
			}
		}
		
		System.out.println(name[N-1]);
		System.out.println(name[0]);
		
	}
}
