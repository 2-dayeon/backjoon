import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int cnt = 0;
        for (String s : arr) {
            int x = Integer.parseInt(s);
            if (x > 0) cnt++;
        }
        System.out.println(cnt);
    }
}