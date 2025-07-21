import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> lia = new ArrayList<>();
        List<Integer> lib = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lia.add(a);
            lib.add(b);
        }
        if (n == 1) System.out.println(0);
        else {
            n = Collections.max(lia) - Collections.min(lia);
            int m = Collections.max(lib) - Collections.min(lib);
            System.out.println(n*m);
        }
    }
}