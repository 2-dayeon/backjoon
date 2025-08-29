import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        li.add(0);
        li.add(1);
        for (int i = 2; i <= n; i++) {
            li.add(li.get(i - 1) + li.get(i-2));
        }
        System.out.println(li.get(n));
    }
}