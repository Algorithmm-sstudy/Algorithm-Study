import java.io.*;

public class bj14916_거스름돈 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count=0;

        while(true){
            if(n%5==0){
                count += n/5;
                break;
            }
            else if(n<0){
                count=-1;
                break;
            }
            n-=2;
            count++;
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
