import java.io.*;
import java.util.StringTokenizer;

public class bj10818_최소최대 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        int min = 1000000;
        int max = -1000000;

        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(str.nextToken());
            if(a<min){
                min=a;
            }
            if(a>max){
                max=a;
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
}
