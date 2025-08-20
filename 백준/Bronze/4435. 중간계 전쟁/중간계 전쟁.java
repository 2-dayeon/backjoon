import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = {1,2,3,3,4,10};
        int[] arr2 = {1,2,2,2,3,5,10};
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < 6; j++) {
                int x = sc.nextInt();
                sum1 += x*arr1[j];
            }
            for (int j = 0; j < 7; j++) {
                int x = sc.nextInt();
                sum2 += x*arr2[j];
            }
            if (sum1 < sum2) System.out.println("Battle " + (i+1) + ": Evil eradicates all trace of Good");
            else if (sum1 > sum2) System.out.println("Battle " + (i+1) + ": Good triumphs over Evil");
            else System.out.println("Battle " + (i+1) + ": No victor on this battle field");
        }
    }
}