import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 2; i < n; i+=2) {
            for (int j = 1; j < n; j++) {
                for (int k = 3; k < n; k++) {
                    if (k >= j+2 && i+j+k == n) cnt ++;
                }
            }
        }
        System.out.println(cnt);
    }
}