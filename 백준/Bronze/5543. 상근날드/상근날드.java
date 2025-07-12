import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        cnt += Math.min(a,Math.min(b, c));
        int d = sc.nextInt();
        int e = sc.nextInt();
        cnt += Math.min(d, e);
        System.out.println(cnt-50);
    }
}