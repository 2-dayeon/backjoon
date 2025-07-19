import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            List<Integer> li = new ArrayList<>();
            li.add(sc.nextInt());
            li.add(sc.nextInt());
            li.add(sc.nextInt());
            int c = Collections.max(li);
            li.remove(Integer.valueOf(c));
            int a = li.get(0);
            int b = li.get(1);
            if (a == 0 && b == 0 && c == 0) break;
            else {
                if ((a*a) + (b*b) == (c*c)) System.out.println("right");
                else System.out.println("wrong");
            }
        }
    }
}