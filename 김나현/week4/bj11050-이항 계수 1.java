import java.io.*;
import java.util.StringTokenizer;

public class bj11050_이항계수1 {

    public static int factorial(int n){
        int ans=1;
        for(int i=n; i>0; i--){
            ans *=i;
        }
        return ans;
    }

    public static int denominator(int n, int k) {
        int a = factorial(n-k);
        int b = factorial(k);
        return a*b;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());

        int ans = factorial(n)/denominator(n,k);

        bw.write(ans+ "");
        bw.flush();
        bw.close();
        br.close();
    }
}
