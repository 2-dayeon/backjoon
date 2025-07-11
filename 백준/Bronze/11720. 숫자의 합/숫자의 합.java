import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            cnt += s.charAt(i) - '0';
        }
        System.out.println(cnt);
    }
}