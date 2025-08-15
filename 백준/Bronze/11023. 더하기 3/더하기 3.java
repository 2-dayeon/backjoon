import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }
}