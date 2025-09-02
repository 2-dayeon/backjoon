import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] li = sc.nextLine().split(" ");
            double cnt = Double.parseDouble(li[0]);

            for (int j = 1; j < li.length; j++) {
                if (li[j].equals("@")) cnt *= 3;
                else if (li[j].equals("%")) cnt += 5;
                else if (li[j].equals("#")) cnt -= 7;
            }
            System.out.printf("%.2f\n",cnt);
        }
    }
}