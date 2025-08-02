import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            li.add(a);
        }
        int min = Collections.min(li);
        li.remove(Collections.max(li));
        int max = Collections.max(li);
        System.out.println(max * min);
    }
}