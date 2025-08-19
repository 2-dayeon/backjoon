import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt  = 1;
        while (true) {
            if (n == 1) break;
            else if (n%2 == 0) n = (n/2);
            else n = (3*n)+1;
            cnt++;
        }
        System.out.println(cnt);
    }
}