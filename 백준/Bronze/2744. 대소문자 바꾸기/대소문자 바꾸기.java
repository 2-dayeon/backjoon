import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        String answer = "";
        for (int i = 0; i < c.length(); i++) {
            if (Character.isUpperCase(c.charAt(i)))
                answer += Character.toLowerCase(c.charAt(i));
            else
                answer += Character.toUpperCase(c.charAt(i));
        }
        System.out.println(answer);
    }
}