import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 31; i++) li.add(i);
        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            li.remove(Integer.valueOf(n));
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(li.get(i));
        }
    }
}