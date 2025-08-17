import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int u = a%2;
            int t = a/2;
            while (true) {
                if (u+t == b) break;
                else {
                    u += 2;
                    t -= 1;
                }
            }
            System.out.println(u +" "+ t);
        }
    }
}