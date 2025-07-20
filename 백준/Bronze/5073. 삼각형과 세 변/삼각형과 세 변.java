import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int cnt = a + b + c;
            a = Math.max(a, Math.max(b, c));
            b = Math.min(a, Math.min(b, c));
            c = cnt - (a + b);
            if (a == 0 && b == 0 && c == 0) break;
            if (a < b + c) {
                if (a == b && a == c) System.out.println("Equilateral");
                else if (a == c || a == b || b == c) System.out.println("Isosceles");
                else System.out.println("Scalene");
            }
            else System.out.println("Invalid");
        }
    }
}