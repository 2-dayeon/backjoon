import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int min = Math.min(a, Math.min(b, c));
            int max = Math.max(a, Math.max(b, c));
            int mid = a + b + c - min-max;
            if ((min*min)+(mid*mid) == max*max) {
                System.out.println("Scenario #"+(i+1)+":");
                System.out.println("yes");
            }
            else {
                System.out.println("Scenario #"+(i+1)+":");
                System.out.println("no");
            }
            System.out.println();
        }
    }
}