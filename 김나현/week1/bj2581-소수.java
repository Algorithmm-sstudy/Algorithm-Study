import java.util.Scanner;

public class bj2581_소수 {

	public static boolean isPrime(int num) {
		if(num<2)
			return false;
		for(int i=2; i<num; i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int sum=0;
		int primeMin = -1;
		
		for(int j=m; j<=n; j++) {
			if(isPrime(j)) {
				sum+=j;
				if(primeMin==-1)
					primeMin=j;
			}
		}
		if(sum==0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(primeMin);
		}

	}

}
