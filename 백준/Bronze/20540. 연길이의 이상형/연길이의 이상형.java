import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] li = s.split("");
        if (li[0].equals("E")) System.out.print("I");
        else if (li[0].equals("I")) System.out.print("E");
        if (li[1].equals("S")) System.out.print("N");
        else if (li[1].equals("N")) System.out.print("S");
        if (li[2].equals("F")) System.out.print("T");
        else if (li[2].equals("T")) System.out.print("F");
        if (li[3].equals("P")) System.out.print("J");
        else if (li[3].equals("J")) System.out.print("P");
    }
}