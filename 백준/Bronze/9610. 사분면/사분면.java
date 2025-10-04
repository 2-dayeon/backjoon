import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 || b == 0) arr[4]++;
            else if (a > 0 && b > 0) arr[0]++;
            else if (a < 0 && b > 0) arr[1]++;
            else if (a < 0 && b < 0) arr[2]++;
            else if (a > 0 && b < 0) arr[3]++;
        }
        for (int i = 1; i < 5; i++) {
            System.out.println("Q" + i + ": " + arr[i-1]);
        }
        System.out.println("AXIS: " + arr[4]);
    }
}