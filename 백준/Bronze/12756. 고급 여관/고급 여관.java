import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        while (true){
            d -= a;
            b -= c;
            if (b <= 0 && d <= 0) {
                System.out.println("DRAW");
                break;
            }
            else if (b <= 0) {
                System.out.println("PLAYER B");
                break;
            } else if (d <= 0) {
                System.out.println("PLAYER A");
                break;
            }
        }
    }
}