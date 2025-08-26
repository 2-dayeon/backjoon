import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int xcnt = 0;
        int ycnt = 0;
        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == y) xcnt++;
        }
        for (int i = 0; i < b; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == y) ycnt++;
        }
        if (xcnt == a && ycnt == b) System.out.println("Accepted");
        else if (xcnt == a) System.out.println("Why Wrong!!!");
        else System.out.println("Wrong Answer");
    }
}