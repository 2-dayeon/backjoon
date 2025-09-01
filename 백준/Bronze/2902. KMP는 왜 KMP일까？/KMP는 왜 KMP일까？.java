import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("-");
        for (String a : arr) {
            System.out.print(a.charAt(0));
        }
    }
}