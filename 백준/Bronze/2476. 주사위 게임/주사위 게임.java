import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == b && a == c) li.add(10000 + (a * 1000));
            else if (a == b || a == c) li.add(1000 + (a * 100));
            else if (b == c) li.add(1000 + (b * 100));
            else li.add((Math.max(a,Math.max(b,c))) * 100);
        }
        System.out.println(Collections.max(li));
    }
}