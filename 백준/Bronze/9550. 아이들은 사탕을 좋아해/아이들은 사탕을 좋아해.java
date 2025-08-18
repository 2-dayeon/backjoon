import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = 0; j < a; j++) {
                int x = sc.nextInt();
                sum += x/b;
            }
            System.out.println(sum);
        }
    }
}