import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n-1; i > -1; i--) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int k = 0; k < n-i; k++) System.out.print("*");
            for (int h = 0; h < n-(i+1); h++) System.out.print("*");
            System.out.println();
        }
    }
}