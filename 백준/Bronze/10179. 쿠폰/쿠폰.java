import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            System.out.printf("$%.2f\n",x*(0.8));
        }
    }
}