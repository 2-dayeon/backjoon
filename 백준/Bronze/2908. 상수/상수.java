import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = "";
        String d = "";
        for (int i = a.length()-1; i > -1; i--) {
            c += a.charAt(i);
            d += b.charAt(i);
        }
        System.out.println(Math.max(Integer.parseInt(c),Integer.parseInt(d)));
    }
}