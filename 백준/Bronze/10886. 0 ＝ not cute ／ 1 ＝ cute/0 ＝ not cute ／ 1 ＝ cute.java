import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) li.add(x);
        }
        if (li.size() > (n/2)) System.out.println("Junhee is not cute!");
        else System.out.println("Junhee is cute!");
    }
}