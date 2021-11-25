import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_5_17070 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int map[][] = new int[N][N];
    int count[][][] = new int[N][N][3];
    for (int i=0;i<N;i++) {
      StringTokenizer line = new StringTokenizer(br.readLine());
      for (int j=0;j<N;j++) {
        map[i][j] = Integer.parseInt(line.nextToken());
      }
    }
    count[0][1][0] = 1;
    for (int i=0;i<N;i++) {
      for (int j=0;j<N;j++) {
        if (j + 1 < N && map[i][j + 1] == 0) {
          count[i][j + 1][0] += count[i][j][0] + count[i][j][1];
        }
        if (i + 1 < N && map[i + 1][j] == 0) {
          count[i + 1][j][2] += count[i][j][1] + count[i][j][2];
        }
        if (i + 1 < N && j + 1 < N && map[i + 1][j] == 0 && map[i][j + 1] == 0 && map[i + 1][j + 1] == 0) {
          count[i + 1][j + 1][1] += count[i][j][0] + count[i][j][1] + count[i][j][2];
        }
      }
    }
    System.out.println(count[N - 1][N - 1][0] + count[N - 1][N - 1][1] + count[N - 1][N - 1][2]);
  }
}
