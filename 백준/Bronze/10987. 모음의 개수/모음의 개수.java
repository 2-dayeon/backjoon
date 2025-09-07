import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> mo = new ArrayList<>(Arrays.asList("a","e","i","o","u"));
        String s = sc.next();
        int cnt = 0;
        String[] li = s.split("");
        for (int i = 0; i < li.length; i++) {
            if (mo.contains(li[i])) cnt++;
        }
        System.out.println(cnt);
    }
}