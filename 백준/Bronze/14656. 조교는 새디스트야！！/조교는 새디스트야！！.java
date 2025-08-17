import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(i+1);
        }
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m != li.get(i)) sum++;
        }
        System.out.println(sum);
    }
}