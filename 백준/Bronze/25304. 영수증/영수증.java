import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        int ct = sc.nextInt();
        for (int i = 0; i < ct; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            cnt += (a*b);
        }
        if (cnt == n) System.out.println("Yes");
        else System.out.println("No");
    }
}