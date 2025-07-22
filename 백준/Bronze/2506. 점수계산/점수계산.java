import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m == 1) {
                cnt++;
                sum += cnt;
            }
            else cnt = 0;
        }
        System.out.println(sum);
    }
}