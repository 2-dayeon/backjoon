import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            li.add(a);
        }
        System.out.println(Collections.min(li));
        System.out.println(Collections.max(li));
    }
}