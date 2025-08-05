import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;
        String s = sc.next();
        String[] abc = s.split("");
        for (int i = 0; i < 3; i++) {
            if (abc[i].equals("A")) System.out.print(min + " ");
            else if (abc[i].equals("B")) System.out.print(mid + " ");
            else if (abc[i].equals("C")) System.out.print(max + " ");
        }
    }
}