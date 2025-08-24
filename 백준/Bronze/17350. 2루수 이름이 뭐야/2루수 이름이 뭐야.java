import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals(("anj"))) cnt++;
        }
        if (cnt >= 1) System.out.println("뭐야;");
        else System.out.println("뭐야?");
    }
}