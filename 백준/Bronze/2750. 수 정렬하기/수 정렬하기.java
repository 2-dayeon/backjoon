import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            li.add(x);
        }
        Collections.sort(li);
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
    }
}