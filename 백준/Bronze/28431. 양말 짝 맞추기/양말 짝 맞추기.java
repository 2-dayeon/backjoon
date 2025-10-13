import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> li = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String n = sc.next();
            if (li.contains(n)) li.remove(n);
            else li.add(n);
        }
        System.out.println(li.get(0));
    }
}