
import java.util.Scanner;

public class 가장가까운두점찾기 {
    public static void main(String args[])  {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[100000];
        int[] y = new int[100000];
        for(int i=0; i<n; i++){
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        int min=-1;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
              int d =  dist(x[i], y[i], x[j], y[j]);
              if(min==-1 || min>d){
                  min = d;
              }
            }
        }
        System.out.println(min);
    }

    public static int dist(int x1, int y1, int x2, int y2){
        return (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
    }

}
