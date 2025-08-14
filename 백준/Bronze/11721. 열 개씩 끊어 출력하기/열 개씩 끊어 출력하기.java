import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] li = s.split("(?<=\\G.{10})");
        for (String i : li) {
            System.out.println(i);
        }
    }
}