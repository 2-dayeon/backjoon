import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                int n = sc.nextInt();
                li.add(n);
            }
            int cnt = Collections.frequency(li, 0);
            if (cnt == 0) System.out.println("E");
            else if (cnt == 1) System.out.println("A");
            else if (cnt == 2) System.out.println("B");
            else if (cnt == 3) System.out.println("C");
            else System.out.println("D");
        }
    }
}