import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            int s = sc.nextInt();
            cnt += s*s;
        }
        System.out.println(cnt%10);
    }
}