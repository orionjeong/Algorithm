import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 포도주시식 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int amount[] =new int[n];
        int memo[][] = new int[n+1][3];
        for(int i=0; i<n; i++){
            amount[i]=Integer.parseInt(br.readLine());
        }

        for(int i=1; i<=n; i++){
            memo[i][0]=Math.max(memo[i-1][0], Math.max(memo[i-1][1], memo[i-1][2]));
            memo[i][1]=memo[i-1][0]+amount[i-1];
            memo[i][2]=memo[i-1][1]+amount[i-1];
        }


        System.out.println(Math.max(memo[n][0], Math.max(memo[n][1],memo[n][2])));
    }
}
