import java.math.BigInteger;
import java.util.Scanner;

public class 이친수 {
    static BigInteger memo[];
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        memo=new BigInteger[n+1];
        System.out.println(topDown(n));
    }
    public static BigInteger topDown(int n){
        if(n==0){
            return BigInteger.valueOf(0);
        }
        if(n<3){
            return BigInteger.valueOf(1);
        }
        if(memo[n]!=null){
            return memo[n];
        }
        memo[n]=topDown(n-1).add(topDown(n-2));

        return memo[n];
    }


}
