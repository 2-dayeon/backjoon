import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = 0;
        int B = 0;
        String s = sc.next();
        String[] arr = s.split("");
        for (String i : arr) {
            if (i.equals("A")) A++;
            else if (i.equals("B")) B++;
        }
        if (A > B) System.out.println("A");
        else if (B > A) System.out.println("B");
        else System.out.println("Tie");
    }
}