import java.util.Scanner;

public class 쉬운계단수 {
    static int[] memo;


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        memo = new int[101];
        memo[0]=0;
        memo[1]=9;
        memo[2]=17;
        System.out.println(topDown(n)%1000000000);
    }

    public static int topDown(int n){

        if(memo[n]>0){
            return memo[n];
        }
        memo[n]= (8*topDown(n-1)+ 2*topDown(n-2))%1000000000;
        return memo[n];
    }
}
