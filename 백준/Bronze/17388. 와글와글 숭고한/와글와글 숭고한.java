import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,Math.min(b,c));
        int cnt = a+b+c;
        if (cnt >= 100) System.out.println("OK");
        else {
            if (min == a) System.out.println("Soongsil");
            else if (min == b) System.out.println("Korea");
            else if (min == c) System.out.println("Hanyang");
        }
    }
}