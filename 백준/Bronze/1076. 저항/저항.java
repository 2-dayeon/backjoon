import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        int[] arr = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String ch = "";
        long x = 1;
        for (int i = 0; i < 10; i++) {
            if (a.equals(s[i])) ch += i;
        }
        for (int i = 0; i < 10; i++) {
            if (b.equals(s[i])) ch += i;
        }
        for (int i = 0; i < 10; i++) {
            if (c.equals(s[i])) {
                x = Integer.parseInt(ch);
                x *= arr[i];
            }
        }
        System.out.println(x);
    }
}