import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int cnt = 0;
            while (true) {
                if (cnt + (cnt*cnt) > x) break;
                else cnt++;
            }
            System.out.println(cnt-1);
        }
    }
}