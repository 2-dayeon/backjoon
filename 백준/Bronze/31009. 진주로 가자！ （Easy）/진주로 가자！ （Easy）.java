import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int sum = 0;
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int m = sc.nextInt();
            li.add(m);
            if (s.equals("jinju")) {
                x = m;
                System.out.println(x);
            }
        }

        for (int j = 0; j < n; j++) {
            if (li.get(j) > x) sum++;
        }

        System.out.println(sum);
    }
}