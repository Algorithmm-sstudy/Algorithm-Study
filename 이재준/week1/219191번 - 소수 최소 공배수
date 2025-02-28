import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static boolean isPrime(int n) {
        if(n < 2) return false;
        for (int i = 2; i  * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] bool = new boolean[1000001];

        long result = 1;

        String[] line = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(line[i]);
            if (isPrime(num) && !bool[num]) {
                result *= num;
                bool[num] = true;
            }
        }

        if (result == 1)
            System.out.println(-1);

        else
            System.out.println(result);
    }

}
