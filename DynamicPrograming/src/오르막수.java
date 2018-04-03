import java.util.Scanner;

public class 오르막수 {
    static int MOD=10007;
    /*
    문제 n자리에서의 오르막 수를 구하는 문제
    메모배열에는 n자리에서의 오르막 수

    마지막에는 입력이 0~9까지 가능하다.
    마지막 수에 따라 입력의 수가 제한되기 때문에 하나의 배열로는 무리
    2차원 배열을 쓰자!!

    memo[n][i]]=memo[n-1][i-1] + ... + memo[n-1][0];
    예외사항:
    길이가1일때 2일때
     */
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int memo[][] = new int[n+1][10];

        for(int i=0;i<10; i++){
            memo[1][i]=1;
        }

        for(int number=2; number<=n; number++){
            for(int endnumber=0; endnumber<10; endnumber++){
                for(int cutline =0; cutline<= endnumber; cutline++){
                    memo[number][endnumber] += memo[number-1][cutline];
                    memo[number][endnumber] %= MOD;
                }
            }
        }

        int add=0;

        for(int i=0; i<memo[n].length; i++){
            add +=memo[n][i];
        }
        System.out.println(add);
    }

//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int mod = 10007;
//
//        int dp[][] = new int[n+1][10];
//
//        //우선 초기화해줘야 함
//        //1자리수 인경우 각 숫자가 들어갈 경우의 수 저장
//        for(int i=0; i<10; i++) dp[1][i] = 1;
//
//        for(int i=2; i<=n; i++){
//            for(int j=0; j<=9; j++){
//                for(int k=0; k<=j; k++){
//                    dp[i][j] += dp[i-1][k]; //시그마는 += 으로 대체될 수 있음.
//                    dp[i][j] %= mod;
//                }
//            }
//
//        }
//
//        int ans = 0;
//        for(int i=0; i<=9; i++){
//            ans += dp[n][i];
//        }
//
//        System.out.println(ans%=mod);
//    }

}
