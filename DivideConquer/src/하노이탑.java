import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 하노이탑 {
    static int count=0;
    static List<String> stringlist = new ArrayList<>();
    public static void 하노이탑해결사(int n, int a, int b, int c){
        if(n==1){
            count++;
            stringlist.add(a+" "+c);
            return;
        }
        하노이탑해결사(n-1, a, c, b);
        하노이탑해결사(1,a,b,c);
        하노이탑해결사(n-1,b,a,c);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        하노이탑해결사(a, 1,2,3);
        System.out.println(count);
        stringlist.forEach((s)-> System.out.println(s));


    }
}
