import java.util.Scanner;

public class Main {
    public static boolean Check(int n) {
        if(n % 4 != 0) {
            return false;
        }
        if(n % 100 != 0) {
            return true;
        }
        if(n % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(Check(year)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
