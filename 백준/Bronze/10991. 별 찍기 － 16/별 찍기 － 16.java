import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n-1; i > -1; i--) { // 2 1 0
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < n - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}