import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        int tocnt = 0;
        int cnt = 0;
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for (int i = 0; i < a; i++) {
            int total = 0;
            for (int j = 0; j < b; j++) {
                if (arr[cnt].equals("0")) total++;
                cnt++;
            }
            if (total < c) tocnt++;
        }
        System.out.println(tocnt);
    }
}