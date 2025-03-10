import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj4796_캠핑 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str;
        int cs = 1;
        while(true) {
            str = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(str.nextToken());
            int P = Integer.parseInt(str.nextToken());
            int V = Integer.parseInt(str.nextToken());
            int days;
            if(L==0&&P==0&&V==0){
                break;
            }
            if(V%P > L){
               days = ((V/P)*L)+L;
            }
            else {
                days = ((V/P)*L)+(V%P);
            }
            bw.write("Case " + cs + ": " + days);
            bw.newLine();
            cs++;
        }
        bw.close();
        br.close();

    }
}
