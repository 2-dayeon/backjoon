import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n+1; i++) {
            if (i%2 == 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for (int j = 0; j < n; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}