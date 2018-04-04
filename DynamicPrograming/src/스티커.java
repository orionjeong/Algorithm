
import java.io.*;
import java.util.*;
public class 스티커 {

/*
구하고자 하는 것은 n개일 때 최댓값!!
최댓값이기 때문에 비교하면서 넣어야 한다.
 */
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            int memo[][]= new int[n+1][3];
            int stiker[][]= new int[2][n+1];
            {
                String stiker1[]=br.readLine().split(" ");
                for(int j=1; j<=stiker1.length; j++){
                    stiker[0][j] = Integer.parseInt(stiker1[j-1]);
                }
            }
            {
                String stiker1[]=br.readLine().split( " ");
                for(int j=1; j<=stiker1.length; j++){
                    stiker[1][j] = Integer.parseInt(stiker1[j-1]);
                }
            }
/*            배열에 담겨 있다 이제
             마지막 n입력에는 3가지가 있다.
             1. 모두 선택안되어있는 경우 0
                memo[n][0]= memo[n-1][0]과 memo[n-1][1]과 memo[n-1][2] 중 하나
             2. 위쪽만 선택된 경우  1
                memo[n][1]= memo[n-1][0]과 memo[n-1][2]+ stiker[1][n]중 하나
             3. 아래쪽만 선택된 경우 2
                memo[n][1]= memo[n-1][0]과 memo[n-1][1]+ stiker[0][n]중 하나
*/
            for(int a =1; a<=n; a++){
                memo[a][0]= Math.max(memo[a-1][0],Math.max( memo[a-1][1], memo[a-1][2]));
                memo[a][1]= Math.max(memo[a-1][0], memo[a-1][2])+stiker[0][a];
                memo[a][2]= Math.max(memo[a-1][0], memo[a-1][1])+stiker[1][a];
            }
            int ans=0;
            ans = Math.max(memo[n][0], Math.max(memo[n][1], memo[n][2]));
            System.out.println(ans);
        }
    }
}

