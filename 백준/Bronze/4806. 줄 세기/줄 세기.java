import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            sum += 1;
        }
        System.out.println(sum);
    }
}