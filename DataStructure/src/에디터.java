import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class 에디터 {

    public static void main(String args[]) throws IOException {
//        스캐너보다 빠르기 때문에
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//        에디터에 들어갈 문자열
        String contents = sc.readLine();
//        명령어 개수
        int n = Integer.parseInt(sc.readLine());
//        명령어 저장할 배열
        String commend[]=new String[n];
//        커서의 왼쪽 부분
        Stack<Character> leftStack = new Stack<>();
//        커서의 오른 쪽 부분
        Stack<Character> rightStack = new Stack<>();
//        string 나중에 합치기 위해서
        StringBuilder string = new StringBuilder();
//        배열의 크기만큼 명령어 입력
        for(int i=0; i<n; i++){
            commend[i] = sc.readLine();
        }

        /*
        * 스택을 커서를 기준으로 두개 만든다.
        * commend에 담긴게 L이라면  left 스택을 팝하고 d라면 right스택을 팝해서 다른 스택에 담아준다.
        * B라면 왼쪽 스택을 팝해버린다
        * P에 대한 것이라면 왼쪽스택에 PUSH해준다.
        *
        * */
//      문자열 쪼갯 스택에 들여놓는다. 커서는 맨오른족에서 시작하니 leftStack에만 넣으면 된다.
        for(int j =0; j<contents.length(); j++){
            leftStack.push(contents.charAt(j));
        }
//        명령어가 무엇인지 확인 그에 맞는 상황처리
        for (String a: commend)
        {
            if(a.equals("L")){
//           예외처리
                if(leftStack.size()!=0){
//                    커서 왼쪽으로 한칸 이동
                    rightStack.push(leftStack.pop());
                }

            }else if(a.equals("D")){
                if(rightStack.size()!=0){
                    leftStack.push(rightStack.pop());
                }
            }else if(a.equals("B")){
                if(leftStack.size()!=0){
                    leftStack.pop();
                }
            }else{
                leftStack.push(a.charAt(2));
            }
        }
//        rightStack.size는 반복을 할 수록 pop하면 점점 동적으로 줄어들기 때문에 변수에 저장
        int a = rightStack.size();
//        right스택에 있는 것을 left스택에 합침
        for(int i =0; i<a; i++){
            leftStack.push(rightStack.pop());
        }
//        leftStack에 저장된 오브젝트들을 돌면서 string에 넣어준다.
        leftStack.forEach((s)-> string.append(s));
        System.out.println(string);
    }
}
