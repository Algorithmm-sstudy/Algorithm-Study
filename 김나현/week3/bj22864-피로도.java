import java.io.*;
import java.util.StringTokenizer;

public class bj22864_피로도 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str= new StringTokenizer(br.readLine());

        int cur_work = 0;
        int cur_state = 0;
        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());
        int c = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        for(int i = 0; i < 24; i++){
            if(a > m){
                break;
            }
            else if(cur_state + a <= m){
                cur_state += a;
                cur_work += b;
            }
            else {
                cur_state -= c;
                if(cur_state < 0){
                    cur_state = 0;
                }
            }
        }
        bw.write(cur_work + "");

        bw.flush();
        bw.close();
        br.close();

    }
}
