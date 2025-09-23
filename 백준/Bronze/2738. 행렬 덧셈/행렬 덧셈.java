import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Integer[][] arr1 = new Integer[a][b];
        Integer[][] arr2 = new Integer[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int x = sc.nextInt();
                arr1[i][j] = x;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int x = sc.nextInt();
                arr2[i][j] = x;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr1[i][j] + arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}