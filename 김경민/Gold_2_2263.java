import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Gold_2_2263 {
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static void printPreOrder(List<Integer> inOrder, List<Integer> postOrder) throws IOException {
    bw.write(postOrder.get(postOrder.size() - 1) + " ");
    int orderIndex = inOrder.indexOf(postOrder.get(postOrder.size() - 1));

    if (orderIndex != 0) {
      printPreOrder(
        inOrder.subList(0, orderIndex),
        postOrder.subList(0, orderIndex)
      );
    }
    if (orderIndex != inOrder.size() - 1)
    printPreOrder(
      inOrder.subList(orderIndex + 1, inOrder.size()),
      postOrder.subList(orderIndex, inOrder.size() - 1)
    );
  }
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    List<Integer> inOrder = new ArrayList<>();
    List<Integer> postOrder = new ArrayList<>();
    StringTokenizer inOrderLine = new StringTokenizer(br.readLine());
    StringTokenizer postOrderLine = new StringTokenizer(br.readLine());

    for (int i=0;i<n;i++) {
      inOrder.add(Integer.parseInt(inOrderLine.nextToken()));
      postOrder.add(Integer.parseInt(postOrderLine.nextToken()));
    }
    printPreOrder(inOrder, postOrder);

    bw.flush();
    bw.close();
  }
}
