import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> li = new ArrayList<>(Arrays.asList("a","e","i","o","u","A","E","I","O","U"));
        while (true) {
            int cnt = 0;
            String s = sc.nextLine();
            if (s.equals("#")) break;
            else {
                String[] sp = s.split("");
                for (String x : sp) {
                    if (li.contains(x)) cnt++;
                }
                System.out.println(cnt);
            }
        }
    }
}