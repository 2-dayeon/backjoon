import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m == 1) System.out.println("#");
            else if (m == 2) System.out.println("##\n##");
            else {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
                System.out.println();
                for (int j = 0; j < m-2; j++) {
                    System.out.print("#");
                    for (int k = 0; k < m-2; k++) {
                        System.out.print("J");
                    }
                    System.out.println("#");
                }
                for (int j = 0; j < m; j++) System.out.print("#");
                System.out.println();
            }
            if(i != n-1) System.out.println();
        }
    }
}