import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            li.add(a);
        }
        for (int i = 0; i < n; i++) {
            sum += li.get(i);
            if (sum > m) break;
            cnt++;
        }
        System.out.println(cnt);
    }
}