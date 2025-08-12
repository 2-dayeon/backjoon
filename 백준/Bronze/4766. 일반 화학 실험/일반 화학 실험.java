import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        while (true) {
            double x = sc.nextDouble();
            if (x == 999) break;
            System.out.printf("%.2f\n",x-n);
            n = x;
        }
    }
}