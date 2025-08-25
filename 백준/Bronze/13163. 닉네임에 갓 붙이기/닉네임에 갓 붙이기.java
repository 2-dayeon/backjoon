import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] li = s.split(" ");
            System.out.print("god");
            for (int j = 1; j < li.length; j++) {
                System.out.print(li[j]);
            }
            System.out.println();
        }
    }
}