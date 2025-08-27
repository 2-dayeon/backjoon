import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 1) {
                int cnt = 0;
                for (int j = 2; j < x; j++) {
                    if (x%j == 0) cnt++;
                }
                if (cnt==0) total++;
            }
        }
        System.out.println(total);
    }
}