import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int h = 0; h < i; h++)
                System.out.print("*");
            System.out.println("");
        }
    }
}