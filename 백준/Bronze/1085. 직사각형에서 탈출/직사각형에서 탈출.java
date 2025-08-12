import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        li.add(x);
        li.add(y);
        li.add(w-x);
        li.add(h-y);
        System.out.println(Collections.min(li));
    }
}