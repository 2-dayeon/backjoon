import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String[] arr = {};
            String s = sc.nextLine();
            if (s.equals("END")) break;
            else {
                arr = s.split("");
                for (int i = arr.length-1; i > -1; i--) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }
}