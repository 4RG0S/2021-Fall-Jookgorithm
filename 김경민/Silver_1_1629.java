import java.util.HashMap;
import java.util.Scanner;

public class Silver_1_1629 {

  static HashMap<Long, Long> map = new HashMap<>();

  static long divide(long A, long B, long C) {
    if (B == 1) {
      return map.get((long)1) % C;
    }
    if (B % 2 == 0) {
      if (map.get(B / 2) == null) {
        map.put(B / 2, divide(A, B / 2, C));
      }
      return (map.get(B / 2) * map.get(B / 2)) % C;
    } else {
      if (map.get(B - 1) == null) {
        map.put(B - 1, divide(A, B - 1, C));
      }
      return (map.get(B - 1) * map.get((long)1)) % C;
    }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long A = scan.nextLong();
    long B = scan.nextLong();
    long C = scan.nextLong();
    map.put((long)1, A);

    long result = divide(A, B, C);
    System.out.println(result);
    scan.close();
  }
}
