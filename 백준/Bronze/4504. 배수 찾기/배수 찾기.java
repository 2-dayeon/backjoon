import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            int x = sc.nextInt();
            if (x == 0) break;
            else if (x % n != 0) System.out.println(x + " is NOT a multiple of " + n + ".");
            else System.out.println(x + " is a multiple of " + n + ".");
        }
    }
}