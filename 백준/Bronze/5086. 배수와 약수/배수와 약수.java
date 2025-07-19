import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String an ="";
            if (a == 0 && b == 0) break;
            else if (a < b) {
                if (b%a == 0) an = "factor";
                else an = "neither";
            } else {
                if (a%b == 0) an = "multiple";
                else an = "neither";
            }
            System.out.println(an);
        }
    }
}