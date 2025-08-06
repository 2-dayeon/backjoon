import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String m = "";
            String y = Integer.toBinaryString(x);
            for (int j = y.length()-1; j > -1; j--) {
                m += y.charAt(j);
            }
            for (int j = 0; j < y.length(); j++) {
                if (m.charAt(j) == '1') System.out.print(j + " ");
            }
        }
    }
}