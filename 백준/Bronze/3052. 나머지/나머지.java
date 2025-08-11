import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            li.add(n%42);
        }
        Set<Integer> set = new HashSet<>(li);
        System.out.println(set.size());
    }
}