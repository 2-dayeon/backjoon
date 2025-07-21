import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int n = sc.nextInt();
                sum += n;
            }
            li.add(sum);
        }
        System.out.println(li.indexOf(Collections.max(li))+1);
        System.out.println(Collections.max(li));
    }
}