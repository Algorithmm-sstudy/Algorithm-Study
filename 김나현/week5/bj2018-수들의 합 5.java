import java.io.*;

public class bj2018_수들의합5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ans;
        int count=0;

        for(int i=1; i<=n; i++){
            ans=0;
            for(int j=i; j<=n; j++){
                ans += j;
                if(ans==n){
                    count++;
                    break;
                }
                else if(ans>n)
                    break;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
