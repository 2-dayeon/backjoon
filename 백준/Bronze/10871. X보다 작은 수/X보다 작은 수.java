import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int h = sc.nextInt();
            if (h < y) System.out.print(h + " ");
        }

    }
}