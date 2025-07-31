import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            float x = sc.nextFloat();
            String s = sc.next();
            if (s.equals("kg")) System.out.printf("%.4f lb", x*2.2046);
            else if (s.equals("lb")) System.out.printf("%.4f kg", x*0.4536);
            else if (s.equals("l")) System.out.printf("%.4f g", x*0.2642);
            else System.out.printf("%.4f l", x*3.7854);
            System.out.println();
        }
    }
}