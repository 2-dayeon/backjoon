import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            sum += (a*350.34) + (b*230.90) + (c*190.55) + (d*125.30) + (e*180.90);
            System.out.printf("$%.2f\n",sum);
        }
    }
}