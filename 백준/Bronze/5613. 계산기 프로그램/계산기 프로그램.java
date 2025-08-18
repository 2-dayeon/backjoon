import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sum = n;
        while (true) {
            if (s.equals("+")) {
                n = sc.nextInt();
                sum += n;
            }
            else if (s.equals("-")) {
                n = sc.nextInt();
                sum -= n;
            }
            else if (s.equals("*")) {
                n = sc.nextInt();
                sum *= n;
            }
            else if (s.equals("/")) {
                n = sc.nextInt();
                sum /= n;
            }
            else if (s.equals("=")) {
                System.out.println(sum);
                break;
            }
            s = sc.next();
        }
    }
}