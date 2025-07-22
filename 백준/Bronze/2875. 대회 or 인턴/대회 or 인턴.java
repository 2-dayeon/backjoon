import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = a/2;
        a -= cnt*2;
        b -= cnt;
        while (true){
            if (a + b < c || (a < 0 || b < 0)) {
                cnt--;
                a += 2;
                b += 1;
            } else break;
        }
        System.out.println(cnt);
    }
}