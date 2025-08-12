import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger x = sc.nextBigInteger();
            if (x.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) System.out.println("even");
            else System.out.println("odd");
        }
    }
}