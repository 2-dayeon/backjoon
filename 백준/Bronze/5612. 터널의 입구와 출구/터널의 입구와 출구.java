import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        li.add(m);
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            m += x;
            m -= y;
            li.add(m);
        }
        if (Collections.min(li) < 0) System.out.println("0");
        else System.out.println(Collections.max(li));
    }
}