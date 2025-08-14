import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int num = x;
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                num += (a*b);
            }
            System.out.println(num);
        }
    }
}