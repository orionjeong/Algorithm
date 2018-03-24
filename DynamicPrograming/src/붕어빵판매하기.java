import java.util.Scanner;

public class 붕어빵판매하기 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n+1];
        for(int i=1; i<=n; i++ ){
            a[i]=scan.nextInt();
        }
        int mark[] = new int[n+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(mark[i]<mark[i-j]+a[j])
                mark[i]=mark[i-j]+a[j];
            }
        }
        System.out.println(mark[n]);
    }

}
