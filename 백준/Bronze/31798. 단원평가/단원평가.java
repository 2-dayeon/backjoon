import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == 0) System.out.println((c*c)-b);
        else if (b == 0) System.out.println((c*c)-a);
        else if (c == 0) {
            for (int i = 0; i < a+b; i++) {
                if (i*i == a+b) System.out.println(i);
            }
        }
    }
}