import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            li1.add(x);
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            li2.add(x);
        }
        System.out.println(Collections.max(li1) + Collections.max(li2));
    }
}