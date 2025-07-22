import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = 0;
        int M = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            Y += 10 + ((m/30)*10);
            M += 15 + ((m/60)*15);
        }
        if (Y == M) System.out.println("Y M " + Y);
        else {
            if (Y < M) System.out.println("Y " + Y);
            else System.out.println("M " + M);
        }
    }
}