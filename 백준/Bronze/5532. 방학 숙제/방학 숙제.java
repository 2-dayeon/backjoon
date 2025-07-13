import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        while (true) {
            if (a <= 0 && b <= 0) break;
            a -= c;
            b -= d;
            day -= 1;
        }
        System.out.println(day);
    }
}