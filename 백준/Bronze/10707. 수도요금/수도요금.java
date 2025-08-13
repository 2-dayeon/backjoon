import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        li.add(a*e);
        if (c < e) li.add(b + (e-c)*d);
        else li.add(b);
        System.out.println(Collections.min(li));
    }
}