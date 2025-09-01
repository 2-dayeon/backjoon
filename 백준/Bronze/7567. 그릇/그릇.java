import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 10;
        String s = sc.nextLine();
        String[] arr = s.split("");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i - 1])) cnt += 5;
            else cnt += 10;
        }
        System.out.println(cnt);
    }
}