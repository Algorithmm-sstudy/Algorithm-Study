import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] radius = new int[N+1];
        int a = 0; int b = 0;
        for(int i = 0; i < N; i++) {
            radius[i] = scanner.nextInt();
        }
        for(int k = 1; k < N; k++) {
            a = radius[0] / gcd(radius[0], radius[k]);
            b = radius[k] / gcd(radius[0], radius[k]);
            System.out.println(a + "/" + b);
        }
        scanner.close();
    }
}
