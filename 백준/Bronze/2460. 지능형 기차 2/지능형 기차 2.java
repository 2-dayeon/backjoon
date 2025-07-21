import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum -= a;
            sum += b;
            li.add(sum);
        }
        System.out.println(Collections.max(li));
    }
}