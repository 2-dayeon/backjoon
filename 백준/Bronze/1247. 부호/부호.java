import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            BigInteger sum = BigInteger.ZERO;
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                BigInteger m = sc.nextBigInteger();
                sum = sum.add(m);
            }
            if (sum.compareTo(BigInteger.ZERO) == 0) System.out.println("0");
            else if (sum.compareTo(BigInteger.ZERO) < 0) System.out.println("-");
            else System.out.println("+");
        }
    }
}
