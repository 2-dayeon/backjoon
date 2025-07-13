import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i < n+1; i++) {
            String s = sc.nextLine();
            System.out.println(i +". " +s);
        }
    }
}