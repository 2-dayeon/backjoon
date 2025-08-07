import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String m = Character.toUpperCase(s.charAt(0)) + s.substring(1);
            System.out.println(m);
        }
    }
}