import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            cnt += n;
        }
        System.out.println(cnt);
    }
}