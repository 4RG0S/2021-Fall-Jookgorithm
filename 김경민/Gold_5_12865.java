import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_5_12865 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer line = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(line.nextToken());
    int K = Integer.parseInt(line.nextToken());
    int result = Integer.MIN_VALUE;
    int maxOfSumV[] = new int[K + 1];
    int mem[] = new int[K + 1];

    for (int i=0;i<N;i++) {
      line = new StringTokenizer(br.readLine());
      int W = Integer.parseInt(line.nextToken());
      int V = Integer.parseInt(line.nextToken());
      for (int j=0;j<=K-W;j++) {
        mem[j+W] = Integer.max(maxOfSumV[j+W], maxOfSumV[j] + V);
      }
      for (int j=0;j<=K;j++) {
        maxOfSumV[j] = mem[j];
      }
    }
    for (int sumV : maxOfSumV) {
      result = Integer.max(result, sumV);
    }

    System.out.println(result);
  }
}
