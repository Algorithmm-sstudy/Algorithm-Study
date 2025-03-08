import java.util.Scanner;

public class bj5597_과제안내신분 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[30];
		
		for(int i=0; i<28; i++) {
			int n = scan.nextInt();
			arr[n-1]=1;
		}
		for(int j=0; j<30; j++) {
			if(arr[j]==0)
				System.out.println(j+1);
		}
	}

}
