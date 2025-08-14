import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int num = 0;
            for (int j = 0; j < 9; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                sum += a;
                num += b;
            }
            if (sum > num) System.out.println("Yonsei");
            else if (sum < num) System.out.println("Korea");
            else System.out.println("Draw");
        }
    }
}