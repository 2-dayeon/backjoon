import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            arr.add(n);
            cnt += n;
        }
        for (int i = 0; i < 2; i++) {
            int n = sc.nextInt();
            arr2.add(n);
            cnt += n;
        }
        System.out.println(cnt - (Collections.min(arr) + Collections.min(arr2)));
    }
}