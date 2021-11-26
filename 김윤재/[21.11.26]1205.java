import java.util.*;

public class b_21_11_26_1205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long score = sc.nextLong();
        int p = sc.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long[] arr_1 = new long[p];
        int cnt = 0;
        if (n == 0) {
            System.out.println(1);
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] > score) {
                    arr_1[i] = arr[i];
                    cnt += 1;
                } else if (arr[i] == score) {
                    arr_1[i] = score;
                    cnt += 1;
                } else {
                    break;
                }
            }
            if (cnt >= p) {
                System.out.println(-1);
            } else {
                arr_1[cnt] = score;
                for (int i = 0; i < p; i++) {
                    if (arr_1[i] == score) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }
    }
}