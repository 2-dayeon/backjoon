import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                arr[i][j] = sc.nextInt();
        }
        int cnt1 = arr[0][0] + arr[1][1];
        int cnt2 = arr[0][1] + arr[1][0];
        System.out.println(Math.min(cnt1, cnt2));
    }
}