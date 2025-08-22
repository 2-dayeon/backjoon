import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String total = Integer.toString(a*b*c);
        for (int i = 0; i < total.length(); i++) {
            arr[total.charAt(i)-'0']++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}