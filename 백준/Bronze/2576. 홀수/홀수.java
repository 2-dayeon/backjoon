import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        List<Integer> hol = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int n = sc.nextInt();
            if (n % 2 == 1) hol.add(n);
        }
        if (hol.size() == 0) System.out.println("-1");
        else {
            for (int i = 0; i < hol.size(); i++) {
                cnt += hol.get(i);
            }
            System.out.println(cnt);
            System.out.println(Collections.min(hol));
        }
    }
}