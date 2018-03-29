import java.util.Scanner;

public class 일로만들기 {
    public static int[] a;
    public int bottomUp(int n){

        int a[]= new int[n+1];
        a[0]=0;
        a[1]=0;
        for(int i=2; i<=n;i++){
            a[i]=a[i-1]+1;
            if(i%2==0){
                int temp=a[i/2]+1;
                if(a[i]>temp){
                    a[i]=temp;
                }
            }
            if(i%3==0){
                int temp=a[i/3]+1;
                if(a[i]>temp){
                    a[i]=temp;
                }
            }

        }
        return a[n];
    }
    public int topDown(int n){

        if(n<2){
            return 0;
        }

        if(a[n]>0){
            return a[n];
        }
        a[n]=topDown(n-1)+1;
        if(n%2==0){
            int temp= topDown(n/2)+1;
            if(a[n]>temp){
                a[n]=temp;
            }
        }
        if(n%3==0){
            int temp = topDown(n/3)+1;
            if(a[n]>temp){
                a[n]=temp;
            }
        }

        return a[n];
    }

    public static void main(String args[]){
        일로만들기 make = new 일로만들기();
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        a= new int[n+1];

        System.out.println(make.topDown(n));
        System.out.println(make.bottomUp(n));
        scan.close();
    }

}
