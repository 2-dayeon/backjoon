import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String x = "";
        String y = "";
        for (int i = a.length()-1; i > -1; i--) {
            x += a.charAt(i);
        }
        for (int i = b.length()-1; i > -1; i--) {
            y += b.charAt(i);
        }
        List<Integer> li = new ArrayList<>();
        String s = Integer.toString(Integer.parseInt(x) + Integer.parseInt(y));
        for (int i = s.length()-1; i > -1; i--) {
            if (li.size() == 0 && s.charAt(i) == '0') continue;
            else {
                li.add(i);
                System.out.print(s.charAt(i));
            }
        }
    }
}