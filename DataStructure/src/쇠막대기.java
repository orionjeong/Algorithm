import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        String cash = scan.nextLine();
        int count=0;
/* 1.스택에 (이면 인덱스를 넣고 )이면 스택에 꺼를 빼낼건데
    만약 1차이라면 레이저 이고 그럼 스택에 남아있는 원소의 개수를 센다.

    2. 만약 1차이가 아니라면 나무막대이며 +1을 해준다!!
  */
    Stack<Integer> commit = new Stack<>();
    for(int i=0; i<cash.length(); i++){
        if(cash.charAt(i)=="(".charAt(0)){
            commit.push(i);
        }else{
            if(i-commit.pop()==1){
                count+=commit.size();
            }else{
                count+=1;
            }
        }
    }
    System.out.println(count);
    }
}
