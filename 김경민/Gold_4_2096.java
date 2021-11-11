import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_4_2096 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int min[][] = new int[N][3];
    int max[][] = new int[N][3];
    int val[][] = new int[N][3];
    for (int i=0;i<N;i++) {
      StringTokenizer line = new StringTokenizer(br.readLine());
      val[i][0] = Integer.parseInt(line.nextToken());
      val[i][1] = Integer.parseInt(line.nextToken());
      val[i][2] = Integer.parseInt(line.nextToken());
    }
    min[0] = val[0];
    max[0] = val[0];
    for (int i=1;i<N;i++) {
      min[i][0] = Integer.min(min[i-1][0] + val[i][0], min[i-1][1] + val[i][0]);
      max[i][0] = Integer.max(max[i-1][0] + val[i][0], max[i-1][1] + val[i][0]);
      min[i][1] = Integer.min(min[i-1][0] + val[i][1], Integer.min(min[i-1][1] + val[i][1], min[i-1][2] + val[i][1]));
      max[i][1] = Integer.max(max[i-1][0] + val[i][1], Integer.max(max[i-1][1] + val[i][1], max[i-1][2] + val[i][1]));
      min[i][2] = Integer.min(min[i-1][1] + val[i][2], min[i-1][2] + val[i][2]);
      max[i][2] = Integer.max(max[i-1][1] + val[i][2], max[i-1][2] + val[i][2]);
    }
    int maxValue = Integer.max(max[N-1][0], Integer.max(max[N-1][1], max[N-1][2]));
    int minValue = Integer.min(min[N-1][0], Integer.min(min[N-1][1], min[N-1][2]));
    System.out.println(maxValue + " " + minValue);
  }
}
