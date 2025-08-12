import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String n = sc.next();
            if (n.equals("0")) break;
            List<Character> li = new ArrayList<>();
            for (int i = 0; i < n.length(); i++) {
                li.add(n.charAt(i));
            }
            int sum = li.size() + 1;
            for (int i = 0; i < li.size(); i++) {
                if (li.get(i).equals('1')) sum += 2;
                else if (li.get(i).equals('0')) sum += 4;
                else sum += 3;
            }
            System.out.println(sum);
        }
    }
}