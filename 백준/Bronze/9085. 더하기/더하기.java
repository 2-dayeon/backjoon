import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                sum += x;
            }
            System.out.println(sum);
        }
    }
}