import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        long one = Long.parseLong(a + b);
        long two = Long.parseLong(c + d);
        System.out.println(one + two);
    }
}