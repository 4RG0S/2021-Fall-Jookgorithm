import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Silver_3_17413 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String line = br.readLine();
    line += " ";
    for (int index = 0; index < line.length(); index += 1) {
      if (line.charAt(index) == ' ') {
        bw.write(' ');
        continue;
      }
      if (line.charAt(index) == '<') {
        bw.write('<');
        index += 1;
        while (line.charAt(index) != '>') {
          bw.write(line.charAt(index));
          index += 1;
        }
        bw.write('>');
        index += 1;
      }
      StringBuffer word = new StringBuffer("");
      while (true) {
        if (line.charAt(index) == ' ' || line.charAt(index) == '<') {
          break;
        }
        word.append(line.substring(index, index + 1));
        index += 1;
      }
      bw.write(word.reverse().toString());
      if (line.charAt(index) == '<' || line.charAt(index) == ' ') {
        index--;
      }
    }
    bw.flush();
  }
}
