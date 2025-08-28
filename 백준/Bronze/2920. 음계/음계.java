import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        for (int i = 8; i > 0; i--) {
            li.add(i);
        }
        int cnt = 0;
        int cnt2 = 0;
        for (int i = 1; i < 9; i++) {
            int x = sc.nextInt();
            if (x == i) cnt++;
            else if (x == li.get(i-1)) cnt2++;
        }
        if (cnt == 8) System.out.println("ascending");
        else if (cnt2 == 8) System.out.println("descending");
        else System.out.println("mixed");
    }
}