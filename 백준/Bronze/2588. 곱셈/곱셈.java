import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 10;
        int sum = 0;
        while (a*10 > cnt) {
            sum += a * (b % cnt);
            System.out.println((a * (b % cnt))/(cnt/10));
            b -= b%cnt;
            cnt *= 10;
        }
        System.out.println(sum);
    }
}