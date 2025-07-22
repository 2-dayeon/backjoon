import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        String s = sc.nextLine();
        BigInteger b = new BigInteger(sc.nextLine());
        if (s.equals("+")) System.out.println(a.add(b));
        else System.out.println(a.multiply(b));
    }
}