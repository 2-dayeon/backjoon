import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("");
        String l = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String[] li = l.split(" ");
        String l2 = "-1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1";
        String[] li2 = l2.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < li.length; j++) {
                if (arr[i].equals(li[j])) {
                    if (li2[j].equals("-1")) li2[j] = Integer.toString(i);
                }
            }
        }
        for (int i = 0; i < li2.length; i++) {
            System.out.print(li2[i] + " ");
        }
    }
}