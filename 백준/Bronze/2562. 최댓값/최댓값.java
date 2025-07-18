import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            li.add(n);
        }
        System.out.println(Collections.max(li));
        System.out.println(li.indexOf(Collections.max(li)) + 1);
    }
}