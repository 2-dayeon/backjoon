import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            System.out.print(m/25 + " ");
            System.out.print((m%25)/10 + " ");
            System.out.print(((m%25)%10)/5 + " ");
            System.out.println(((m%25)%10)%5 + " ");
        }
    }
}