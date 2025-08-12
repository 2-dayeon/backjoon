import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        List<Integer> li = new ArrayList<>();
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            sum += y;
            sum -= x;
            if (sum == 0) break;
            li.add(sum);
        }
        System.out.println(Collections.max(li));
    }
}