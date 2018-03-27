import java.util.Scanner;

public class 괄호 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();// 이는 nextint는 숫자만을 받아들이고 다음 개행문자를 nextLine이 받아버리기 대문에 이를 개행문자를 처리하기 위해서 만듬
        String[] scope = new String[n];
        int count=0;
        for(int i =0; i<n; i++){
            scope[i] = scan.nextLine();
        }

       for( String a : scope){

            for(int j=0; j<a.length(); j++){
                if(a.charAt(j)=="(".charAt(0)){
                    count ++;
                }else{
                    count --;
                    if(count<0){
                        break;
                    }
                }

            }
           if(count==0){
              System.out.println("YES");
           }else{
               System.out.println("NO");
           }
           count=0;
        }


    }
}
