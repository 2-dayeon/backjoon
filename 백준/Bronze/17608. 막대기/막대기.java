import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        List<Integer> li = new ArrayList<>(); // 5 4 3 2 1
        List<Integer> li1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(sc.nextInt());
        }
        li1.add(li.get(n-1)); // 1
        for (int i = n-2; i > -1; i--) { //1
            if (li.get(i) > li1.get(li1.size()-1)) {
                cnt++;
                li1.add(li.get(i));
            }
        }
        System.out.println(cnt);
    }
}