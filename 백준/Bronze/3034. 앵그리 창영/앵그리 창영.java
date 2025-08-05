import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b*b+c*c;
        int sq = (int) Math.sqrt(d);
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            if (n <= b || n <= c || n <= sq) System.out.println("DA");
            else System.out.println("NE");
        }
    }
}