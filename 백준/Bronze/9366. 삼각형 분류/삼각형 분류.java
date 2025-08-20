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
            int mid = a+b+c - min-max;
            if (max < min+mid){
                if (a == b && b == c) System.out.println("Case #" + (i + 1) + ": equilateral");
                else if (a == b || b == c || a == c) System.out.println("Case #" + (i + 1) + ": isosceles");
                else if (a != b && a != c && b != c) System.out.println("Case #" + (i + 1) + ": scalene");
            }
            else System.out.println("Case #" + (i + 1) + ": invalid!");
        }
    }
}