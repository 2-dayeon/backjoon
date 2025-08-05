import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] arr1 = time.split(":");
        int total1 = Integer.parseInt(arr1[0])*3600 + Integer.parseInt(arr1[1])*60 + Integer.parseInt(arr1[2]);
        String time2 = sc.next();
        String[] arr2 = time2.split(":");
        int total2 = Integer.parseInt(arr2[0])*3600 + Integer.parseInt(arr2[1])*60 + Integer.parseInt(arr2[2]);
        if (total1 < total2) {
            int diff1 = total2 - total1;
            System.out.printf("%02d:%02d:%02d",diff1/3600,(diff1%3600)/60,(diff1%3600)%60);
        }
        else {
            total1 -= 86400;
            int diff2 = total1 - total2;
            if (diff2 < 0) diff2 *= -1;
            System.out.printf("%02d:%02d:%02d",diff2/3600,(diff2%3600)/60,(diff2%3600)%60);
        }
    }
}
