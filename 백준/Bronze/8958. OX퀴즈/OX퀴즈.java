import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int cnt = 0;
            String s = sc.next();
            String[] arr = s.split("");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("O")) cnt++;
                else cnt = 0;
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}