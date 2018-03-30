import java.math.BigInteger;
import java.util.Scanner;

public class 이친수 {
    static BigInteger memo[];
    static BigInteger memo2[];
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        memo=new BigInteger[n+1];
        memo2=new BigInteger[91];
        System.out.println(topDown(n));
        System.out.println(bottomUp(n));
    }

    public static BigInteger bottomUp(int n){
        memo2[0]=BigInteger.valueOf(0);
        memo2[1] = BigInteger.valueOf(1);
        memo2[2] = BigInteger.valueOf(1);

        for(int i=3; i<=n; i++){
            memo2[i]=memo2[i-1].add(memo2[i-2]);
        }

        return memo2[n];
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
