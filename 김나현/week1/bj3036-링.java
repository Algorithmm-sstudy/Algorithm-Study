import java.util.Scanner;

public class bj3036_링 {

	public static int gcd(int a, int b) {
		if(b==0) 
			return a;
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int radius[] = new int[100];
		
		for(int i=0; i<N; i++) {
			int num = scan.nextInt();
			radius[i]=num;
		}
		
		for(int i=1; i<N; i++) {
			int denominator;
			denominator = gcd(radius[0], radius[i]);
			System.out.println(radius[0]/denominator + "/" + radius[i]/denominator);
		}

	}

}
