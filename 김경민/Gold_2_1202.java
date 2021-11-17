import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Gold_2_1202 {
  static class Jewel implements Comparable<Jewel> {
    int M, V;
    public Jewel(int M, int V) {
      this.M = M;
      this.V = V;
    }
    @Override
    public int compareTo(Jewel comp) {
      if (this.V < comp.V) {
        return 1;
      } else if (this.V > comp.V) {
        return -1;
      } else if (this.M < comp.M) {
        return 1;
      } else if (this.M > comp.M) {
        return -1;
      } else {
        return 0;
      }
    }

  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer line = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(line.nextToken());
    int K = Integer.parseInt(line.nextToken());
    PriorityQueue<Jewel> q = new PriorityQueue<>();
    Integer C[] = new Integer[K];
    long result = 0;
    for (int i = 0; i < N; i += 1) {
      line = new StringTokenizer(br.readLine());
      int M = Integer.parseInt(line.nextToken());
      int V = Integer.parseInt(line.nextToken());
      q.add(new Jewel(M, V));
    }
    for (int i = 0; i < K; i += 1) {
      C[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(C, Collections.reverseOrder());
    for (int index = 0; index < C.length; index += 1) {
      while (!q.isEmpty() && q.peek().M > C[index]) {
        q.poll();
      }
      if (q.isEmpty()) {
        break;
      }
      // System.out.println(q.peek().V);
      result += q.poll().V;
    }
    System.out.println(result);
  }
}
