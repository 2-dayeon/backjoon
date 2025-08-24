import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        int[] arr = new int[]{100,100,200,200,300,300,400,400,500};
        for (int i = 0; i < 9; i++) {
            int x = sc.nextInt();
            sum += x;
            if (x > arr[i]) cnt++;
        }
        if (cnt >= 1) System.out.println("hacker");
        else if (sum >= 100) System.out.println("draw");
        else System.out.println("none");
    }
}