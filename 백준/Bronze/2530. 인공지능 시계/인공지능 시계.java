import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int se = sc.nextInt();
        int cnt = (a*3600) + (b*60) + c + se;
        if (cnt/3600 > 23) {
            System.out.print((cnt/3600) % 24 + " ") ;
            System.out.print((cnt%3600)/60 + " ");
            System.out.print((cnt%3600)%60);
        }
        else {
            System.out.print((cnt/3600) + " ") ;
            System.out.print((cnt%3600)/60 + " ");
            System.out.print((cnt%3600)%60);
        }
    }
}