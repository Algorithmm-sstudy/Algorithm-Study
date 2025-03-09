import java.io.*;
import java.util.StringTokenizer;

public class bj2839_설탕배달 {
    public static int c=0;
    public static int div(int n){
        if(n==3 || n==6 || n==9 || n==12) {
            return c + (n/3);
        }
        else if(n==1 || n==2 || n==4 || n==5 || n==7){
            return -1;
        }
        c++;
        return div((n-5));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result;
        if(n%5==0){
            result = n/5;
        }
        else{
            result = div(n);
        }
        bw.write(result + "\n");
        bw.close();
        br.close();

    }
}
