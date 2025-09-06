import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            li.add(sc.nextInt());
        }
        System.out.println(li.get(0) + li.get(1) - li.get(2));
        int x = Integer.parseInt(Integer.toString(li.get(0)) + Integer.toString(li.get(1)));
        System.out.println(x - li.get(2));
    }
}