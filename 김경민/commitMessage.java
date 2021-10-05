import java.time.LocalDate;
public class commitMessage {
  public static void main(String args[]) {
    LocalDate currentDate = LocalDate.now();
    for (int i = 0; i < args.length; i += 1) {
      String line = args[i];
      if (line.equals("file:") || line.equals("modified:")) {
        String fileName = args[i + 1];
        System.out.println("[" + currentDate.getYear() % 100 + "." + currentDate.getMonthValue() + "." + currentDate.getDayOfMonth() + "]" + fileName);
        break;
      }
    }
  }
}
