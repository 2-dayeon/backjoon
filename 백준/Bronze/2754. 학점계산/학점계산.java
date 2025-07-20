import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cnt = 0.0;
        String s = sc.next();
        String[] w = s.split("");
        if (w[0].equals("A")) cnt = 5.0;
        else if (w[0].equals("B")) cnt = 4.0;
        else if (w[0].equals("C")) cnt = 3.0;
        else if (w[0].equals("D")) cnt = 2.0;
        else if (w[0].equals("F")) cnt = 0.0;
        if (!(w[0].equals("F"))) {
            if (w[1].equals("+")) cnt -= 0.7;
            else if (w[1].equals("0")) cnt -= 1.0;
            else cnt -= 1.3;
        }
        System.out.println(cnt);
    }
}