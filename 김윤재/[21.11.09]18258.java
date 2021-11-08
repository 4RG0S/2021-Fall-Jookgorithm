import java.util.*;
import java.io.*;

public class b_21_11_09_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<Integer>();
        int n = Integer.parseInt(br.readLine());
        String c = "";
        for (int i = 0; i < n; i++) {
            String d = br.readLine();
            StringTokenizer st = new StringTokenizer(d);
            String a = st.nextToken();
            if (a.equals("push")) {
                String b = st.nextToken();
                c = b;
                queue.add(Integer.parseInt(b));
            } else if (a.equals("pop")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(queue.poll()) + "\n");
                }
            } else if (a.equals("size")) {
                bw.write(Integer.toString(queue.size()) + "\n");
            } else if (a.equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (a.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Integer.toString(queue.peek()) + "\n");
                }
            } else if (a.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(c + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
