import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a-b < 0) System.out.println((a-b)*-1);
        else System.out.println(a-b);
    }
}