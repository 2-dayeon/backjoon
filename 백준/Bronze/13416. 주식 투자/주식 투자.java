import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < x; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int max = Math.max(a, Math.max(b, c));
                if (max>0) sum += max;
            }
            System.out.println(sum);
        }
    }
}