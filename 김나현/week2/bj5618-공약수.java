import java.util.Scanner;

public class bj5618_공약수 {
    public static void cm2(int a, int b){
        for(int i = 1; a>=i && b>=i; i++){
            if(a%i==0 && b%i==0){
                System.out.println(i);
            }
        }
    }
    public static void cm3(int a, int b, int c){
        for(int i = 1; a>=i && b>=i && c>=i; i++){
            if(a%i==0 && b%i==0 && c%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n==2){
            int twoNum1 = scan.nextInt();
            int twoNum2 = scan.nextInt();
            cm2(twoNum1, twoNum2);
        }
        else if(n==3){
            int threeNum1 = scan.nextInt();
            int threeNum2 = scan.nextInt();
            int threeNum3 = scan.nextInt();
            cm3(threeNum1, threeNum2, threeNum3);
        }
    }
}
