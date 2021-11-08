import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver_4_1021 {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> reverseQueue = new LinkedList<>();

    StringTokenizer line = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(line.nextToken());
    int M = Integer.parseInt(line.nextToken());
    int result = 0;
    for (int i = 1; i <= N; i += 1) {
      reverseQueue.add(N - i + 1);
      queue.add(i);
    }

    line = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i += 1) {
      int value = Integer.parseInt(line.nextToken());
      int queueMoving = 0;
      int reverseQueueMoving = 0;
      while (true) {
        int poll = queue.poll();
        if (poll == value) {
          break;
        }
        queue.add(poll);
        queueMoving++;
      }
      while (true) {
        int poll = reverseQueue.poll();
        if (poll == value) {
          reverseQueueMoving++;
          break;
        }
        reverseQueue.add(poll);
        reverseQueueMoving++;
      }
      result += Integer.min(queueMoving, reverseQueueMoving);
    }

    System.out.println(result);
  }
}
