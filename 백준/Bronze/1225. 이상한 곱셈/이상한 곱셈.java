import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String[] x = a.split("");
        String[] y = b.split("");
        long sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                sum += Integer.parseInt(x[i]) * Integer.parseInt(y[j]);
            }
        }
        System.out.println(sum);
    }
}