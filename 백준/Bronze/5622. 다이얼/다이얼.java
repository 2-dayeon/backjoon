import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int total = 0;
        String[] li = s.split("");
        for (int i = 0; i < li.length; i++) {
            char c = li[i].charAt(0);
            if (c == 'A'|| c=='B'|| c=='C') total+=3;
            else if (c == 'D'|| c=='E'|| c=='F') total+=4;
            else if (c == 'G'|| c=='H'|| c=='I') total+=5;
            else if (c == 'J'|| c=='K'|| c=='L') total+=6;
            else if (c == 'M'|| c=='N'|| c=='O') total+=7;
            else if (c == 'P'|| c=='Q'|| c=='R' || c=='S') total+=8;
            else if (c == 'T'|| c=='U'|| c=='V') total+=9;
            else total+=10;
        }
        System.out.println(total);
    }
}