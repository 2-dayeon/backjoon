import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Float> li = new ArrayList<>();
        float a = sc.nextInt();
        float b = sc.nextInt();
        float num = (1000/b)*a;
        li.add(num);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            num = (1000/b)*a;
            li.add(num);
        }
        System.out.printf("%.2f",Collections.min(li));
    }
}