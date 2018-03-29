import java.util.Scanner;

public class 더하기123 {
    static int memo[];
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int data[] = new int[n];
        memo= new int[n+1];
        for(int i=0; i<n; i++ ){
            data[i]=scan.nextInt();
        }
/*
배열에 있는 값들을 하나씩 꺼내와서 실행한다. 어차피 for문을 돌면서 함수를 실행해주면된다. 그리고 결과를 배열에 담고 출력하면 될 듯
재귀함수는 일단 탈출구와 메모배열에 값이있으면 바로 가져와야 한다.
 */
        for(int j=0; j<data.length; j++){
            memo=new int[data[j]+1];
            System.out.println(addCount(data[j]));
        }
    }
    public static int addCount(int n){
      if(n<3){
          return memo[n]=n;
      }
      if(n==3){
          return memo[3]=4;
      }
      if(memo[n]>0){
          return memo[n];
      }
        memo[n]= addCount(n-1)+ addCount(n-2) +addCount(n-3);
        return memo[n] ;
    }

    public static it
}
