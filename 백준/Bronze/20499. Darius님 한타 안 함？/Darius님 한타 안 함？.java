import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] word = s.split("/");
        if (Integer.parseInt(word[0]) + Integer.parseInt(word[2]) < Integer.parseInt(word[1]) || Integer.parseInt(word[1]) == 0) System.out.println("hasu");
        else System.out.println("gosu");
    }
}