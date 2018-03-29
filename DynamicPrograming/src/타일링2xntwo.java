import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 타일링2xntwo {

    static int[] memo;
    static int[] memo2;
    public static void main(String[ ] args) throws IOException {
// 타일링 할 수 있는 개수를 구하기
//        타일링을 분석해본 결과 n-1 +n-2가 n이 되고 있다. 이를 노리면 되겠다.
//        n 입력받기
//        저장할 메모배열만들기 n개만큼
//        재귀함수 만들어서 그 안에서 n-1+n-2하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        memo =new int[n+1];
        memo2 = new int[n+1];
        System.out.println(topDownFull(n) );
        System.out.println(bottomUpFull(n));
    }
    public static int bottomUpFull(int n){
// for문을 통해서 작은 문제부터 정답을 채워나감
        if(n<2){
            return memo2[n]=1;
        }
        for(int i =2; i<=n; i++){
            memo2[i]= (memo2[i-1]+(2*memo2[i-2]))%10007;
        }
        return memo2[n];
    }
    public static int topDownFull(int n){
        if(n<2) return 1;
        if(memo[n]>0) return memo[n];
        memo[n] = (topDownFull(n-1)+(2*topDownFull(n-2)))%10007;
        return memo[n];
    }
}
