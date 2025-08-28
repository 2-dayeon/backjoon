import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = Integer.parseInt(s)-1; i > -1; i--) {
            sum = 0;
            String c = Integer.toString(i);
            String[] li = c.split("");
            sum += Integer.parseInt(c);
            for (int j = 0; j < li.length; j++) {
                sum += Integer.parseInt(li[j]);
            }
            if (sum == Integer.parseInt(s)){
                list.add(Integer.parseInt(c));
            }
        }
        if (list.size() == 0) System.out.println("0");
        else System.out.println(Collections.min(list));
    }
}