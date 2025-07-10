import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long cnt = 1;
        for (int i = 1; i <= a; i++) {
            cnt *= i;
        }
        System.out.println(cnt);
    }
}