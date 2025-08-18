import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i < 501; i++) {
            for (int j = 1; j < 501; j++) {
                if (i*i == (j*j)+n) cnt++;
            }
        }
        System.out.println(cnt);
    }
}