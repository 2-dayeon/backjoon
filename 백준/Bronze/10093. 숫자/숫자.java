import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = Math.min(a,b);
        long y = Math.max(a,b);
        if (x == y) System.out.println(0);
        else System.out.println(y-x-1); {
            for (Long i = x+1; i < y; i++) {
                System.out.print(i);
                if (i != (y-1)) System.out.print(" ");
            }
        }
    }
}