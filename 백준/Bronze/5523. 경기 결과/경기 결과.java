import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > y) sum1 += 1;
            else if (x < y) sum2 += 1;
        }
        System.out.println(sum1 + " " + sum2);
    }
}