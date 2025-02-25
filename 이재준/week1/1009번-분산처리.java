import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int ans = 1;

            for(int j = 0; j < b; j++) {
                ans = (ans * a) % 10;
            }
            if(ans != 0) {
                System.out.println(ans);
            }
            else{
                System.out.println(10);
            }
        }
        scanner.close();
    }
}
