import java.util.Scanner;

public class bj1009_분산처리 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int data=1;
			
			for(int j=0; j<b; j++) {
				data = (data*a)%10;
			}
			
			if(data%10==0) {
				System.out.println(10);
			}
			else {
				System.out.println(data%10);
			}
		}

	}

}
