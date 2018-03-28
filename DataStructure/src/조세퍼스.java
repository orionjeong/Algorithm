import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//1158번 문제
public class 조세퍼스 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int peoplecount =scan.nextInt();
        int turn = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        Queue <Integer> q1 = new <Integer>LinkedList();
        sb.append("<");
        for(int i=1; i<=peoplecount; i++ ){
            q1.add(i);
        }
        for(int i=0; i<peoplecount; i++) {
            for (int j = 0; j < turn - 1; j++) {
                q1.add(q1.poll());
            }
            if(i==peoplecount-1){
                sb.append(q1.poll());
            }else{
                sb.append(q1.poll()+", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
