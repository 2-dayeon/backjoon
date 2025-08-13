import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            String s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                char t = s.charAt(j);
                if (t == '3' || t == '6' || t == '9') sum++;
            }
        }
        System.out.println(sum);
    }
}