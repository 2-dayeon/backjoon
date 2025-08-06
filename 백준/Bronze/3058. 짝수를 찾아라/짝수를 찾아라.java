import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j < 7; j++) {
                int x = sc.nextInt();
                if (x%2 == 0) {
                    sum += x;
                    li.add(x);
                }
            }
            System.out.print(sum + " ");
            System.out.println(Collections.min(li));
        }
    }
}