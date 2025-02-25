import java.util.Scanner;

public class Main {
    public static Boolean check(int a) {
        if(a==1) {
            return false;
        }
        for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int total = 0; int min = 1000000;
        for(int i = m; i <= n; i++) {
            if(check(i)) {
                total += i;
                if(min > i) {
                    min = i;
                }
            }
        }
        if(total == 0) {
            System.out.println("-1");
        }
        else{
            System.out.println(total + "\n" + min);
        }
    }
}
