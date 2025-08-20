import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] A = {9.23076f, 1.84523f, 56.0211f, 4.99087f, 0.188807f, 15.9803f, 0.11193f};
        float[] B = {26.7f, 75f, 1.5f, 42.5f, 210f, 3.8f, 254f};
        float[] C = {1.835f, 1.348f, 1.05f, 1.81f, 1.41f, 1.04f, 1.88f};
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                int x = sc.nextInt();
                if (j == 0 || j == 3 || j == 6) sum += A[j] * Math.pow(B[j]-x, C[j]);
                else sum += A[j] * Math.pow(x-B[j], C[j]);
            }
            System.out.println(sum);
        }
    }
}