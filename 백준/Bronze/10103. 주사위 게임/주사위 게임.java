import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 100;
        int sa = 100;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) ch -= b;
            else if (a > b) sa -= a;
        }
        System.out.println(ch);
        System.out.println(sa);
    }
}