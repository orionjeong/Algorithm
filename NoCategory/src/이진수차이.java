import java.util.Scanner;

public class 이진수차이 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String binary = Integer.toBinaryString(n);
        int start=0;
        int max=0;
        int flag=0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=="1".charAt(0)){
                if(flag>0 && max<i-start-1){
                  max=i-start-1;
                  start=i;
                }else{
                    flag =1;
                    start =i;

                }
            }
        }

        System.out.println(max);


    }
}
