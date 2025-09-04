import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (li.contains(x)) cnt++;
            else li.add(x);
        }
        System.out.println(cnt);
    }
}