import javax.net.ssl.SSLEngineResult;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] arg = sc.nextLine().split(" ");

        HashSet<String> hash = new HashSet(Arrays.asList(arg));

        String[] argss = hash.toArray(new String[0]);

        System.out.println(num - (argss.length));


    }
}
