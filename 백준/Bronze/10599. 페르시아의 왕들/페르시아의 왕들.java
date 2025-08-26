import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                int x = sc.nextInt();
                arr[i] = x;
            }
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0) break;
            Arrays.sort(arr);
            System.out.println((arr[2]-arr[1]) + " " + (arr[3]-arr[0]));
        }
    }
}