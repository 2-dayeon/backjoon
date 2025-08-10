import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) li.add(sc.nextInt());
        int m = Collections.max(li);
        for (int i = 0; i < n; i++) {
            sum += (double) li.get(i)/m*100;
        }
        System.out.printf("%.2f",sum/n);
    }
}