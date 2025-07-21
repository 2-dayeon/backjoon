import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = (a + b + c) - max - min;
        while (true) {
            if (max < min + mid) {
                System.out.println(max + min + mid);
                break;
            }
            else max -= 1;
        }
    }
}