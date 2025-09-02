import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        int sum = Integer.parseInt(s) + Integer.parseInt(s1);
        String[] a = s.split("");
        String[] b = s1.split("");
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("6")) cnt1 += Math.pow(10,a.length-i-1) ;
            else if (a[i].equals("5")) cnt2+= Math.pow(10,a.length-i-1);
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i].equals("6")) cnt1+=Math.pow(10,b.length-i-1);
            else if (b[i].equals("5")) cnt2+=Math.pow(10,b.length-i-1);
        }
        System.out.print((sum - cnt1) + " " + (sum + cnt2));
    }
}