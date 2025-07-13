import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            a += n;
        }
        for (int i = 0; i < 4; i++) {
            int m = sc.nextInt();
            b += m;
        }
        System.out.println(Math.max(a,b));
    }
}