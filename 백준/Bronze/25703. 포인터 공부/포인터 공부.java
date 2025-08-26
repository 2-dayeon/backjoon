import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("int a;");
        for (int i = 1; i <= n; i++) {
            if (i == 1) System.out.println("int *ptr = &a;");
            else if (i == 2) System.out.println("int **ptr2 = &ptr;");
            else {
                System.out.print("int ");
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("ptr" + i + " = &ptr" + (i-1) + ";");
            }
        }
    }
}