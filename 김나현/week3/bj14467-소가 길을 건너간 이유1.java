import java.util.Scanner;

public class bj14467_소가길을건너간이유1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();

        int arr[] = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i]=-1;
        }

        int count = 0;
        int cow, dir;
        for(int j = 0; j < n; j++){
            cow = scan.nextInt();
            dir = scan.nextInt();
            if(arr[cow-1]==-1){
                arr[cow-1]=dir;
            }
            else if(arr[cow-1] != dir){
                arr[cow-1]=dir;
                count++;
            }
        }

        System.out.println(count);
    }
}
