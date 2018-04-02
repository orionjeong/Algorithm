import java.util.Scanner;

public class 쉬운계단수 {
    static int[] memo;

/*
1. 뭘 구하고자 하느냐(가장 중요!!! ): n자리에서의 쉬운계단수 경우의 수
2. 메모배열에는 n자리에서의 경우의 수가 들어간다. 아니 끝의 자리에 따라 달라진다!!
그렇다면 메모의배열 2차원배열로 만들고 마지막 수를 넣어주자!

 */
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
                    memo[j][z]= memo[j-1][1];
                }
                if(z>=2 && z<=8){
                    memo[j][z]= memo[j-1][z-1]+ memo[j-1][z+1];
                }
                if(z==9){
                    memo[j][z]= memo[j-1][8];
                }
            }
        }

        for(int i=1; i<memo[n].length; i++){
            add +=memo[n][i];
        }
        System.out.println(add);
    }



}
