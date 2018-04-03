import java.util.Scanner;

public class 쉬운계단수 {
    static int[] memo;

    static private int MOD=1000000000;



    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][] memo = new int[n+1][10];
        int add=0;
        for(int i=1; i<10; i++){
            memo[1][i]=1;
        }

        for(int j=2; j<=n; j++){
            for(int z=0; z<=9; z++){
                if(z==0){
                    memo[j][0]= memo[j-1][1]%MOD;
                }
                if(z>=1 && z<=8){
                    memo[j][z]=0;
                    memo[j][z]= (memo[j-1][z-1]+memo[j-1][z+1])%MOD;
                }
                if(z==9){
                    memo[j][9]= memo[j-1][8]%MOD;
                }
            }
        }
        for(int i=0; i<memo[n].length; i++){
            add =(add+memo[n][i])%MOD;
        }
        System.out.println(add);
    }

}
