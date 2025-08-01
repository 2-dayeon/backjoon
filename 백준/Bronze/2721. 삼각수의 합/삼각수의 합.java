import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            int sum = 0;
            for (int k = 1; k <= m; k++) {
                int T = k+1;
                int sum2 = 0;
                for (int t = 1; t <= T; t++) sum2 += t;
                sum += (k * sum2);
            }
            System.out.println(sum);
        }
    }
}