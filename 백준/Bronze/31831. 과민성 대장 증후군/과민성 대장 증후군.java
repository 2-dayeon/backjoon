import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            sum += n;
            if (sum < 0) sum = 0;
            if (sum >= b) li.add(sum);
        }
        System.out.println(li.size());
    }
}