import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int cnt = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            cnt -= (a*3600) + (b*60) + c;
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            cnt += (d*3600) + (e*60) + f;
            System.out.println((cnt/3600) + " " + (cnt%3600)/60 + " " + (cnt%3600)%60);
        }
    }
}