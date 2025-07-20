import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((((n % 300)%60)%10) == 0) {
            System.out.print(n / 300 +" ");
            System.out.print((n % 300)/60 + " ");
            System.out.print(((n % 300)%60)/10);
        } else System.out.println("-1");
    }
}