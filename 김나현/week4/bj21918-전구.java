import java.io.*;
import java.util.StringTokenizer;

public class bj21918_전구 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        int[] arr = new int[n];
        str = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int cur_lamp = Integer.parseInt(str.nextToken());
            arr[i] = cur_lamp;
        }

        for(int i=0; i<m; i++){
            str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            int c = Integer.parseInt(str.nextToken());

            if(a==1){
                arr[b-1]=c;
            }
            else if(a==2){
                for(int j=b-1; j<c; j++){
                    if(arr[j]==1){
                        arr[j]=0;
                    }
                    else {
                        arr[j]=1;
                    }
                }
            }
            else if(a==3){
                for(int j=b-1; j<c; j++){
                    arr[j]=0;
                }
            }
            else if(a==4){
                for(int j=b-1; j<c; j++){
                    arr[j]=1;
                }
            }
        }
        for(int i=0; i<n; i++){
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
