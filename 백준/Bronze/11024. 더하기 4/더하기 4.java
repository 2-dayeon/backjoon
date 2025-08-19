import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            for (String str : arr) {
                sum += Integer.parseInt(str);
            }
            System.out.println(sum);
        }
    }
}