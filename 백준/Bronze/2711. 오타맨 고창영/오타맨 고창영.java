import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String s = sc.next();
            String[] arr = s.split("");
            for (int j = 0; j < arr.length; j++) {
                if (j == a-1) continue;
                else System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}