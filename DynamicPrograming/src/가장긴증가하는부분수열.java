import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 가장긴증가하는부분수열 {
    public static void main(String arg[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] value = new int[n+1];
        int[] memo= new int[n+1];
        int max=1;
        for(int i=1; i<value.length; i++){
            value[i]= scanner.nextInt();
        }

        for(int i=1; i<value.length; i++){
            memo[i]=1;
            for(int j=1; j<i; j++){
                if(value[i]>value[j]){
                    memo[i]=Math.max(memo[i], memo[j]+1);
                }
            }
            max = Math.max(memo[i], max);
        }

        System.out.println(max);

    }
}
