import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 포도주시식 {
    public static void main(String args[]) throws IOException {
     BufferedReader buffferReader = new BufferedReader(new InputStreamReader(System.in));
     int cupNumber = Integer.parseInt(buffferReader.readLine());
     int[] cupVolume = new int[cupNumber+1];
     int[] memo = new int[cupNumber+1];
     for(int i = 1; i<cupNumber+1; i++){
         cupVolume[i]= Integer.parseInt(buffferReader.readLine());
     }
        memo[1] = cupVolume[1];
     if(cupNumber>1){
         memo[2] = cupVolume[1]+cupVolume[2];
     }
     for(int i=3; i<cupNumber+1; i++){
        memo[i] = Math.max(memo[i-1], Math.max(cupVolume[i]+memo[i-2],cupVolume[i]+cupVolume[i-1]+ memo[i-3]));
//         memo[i]= memo[i-1];
//         if(memo[i]< cupVolume[i]+memo[i-2]){
//             memo[i]= cupVolume[i]+memo[i-2];
//         }
//         if(memo[i]< cupVolume[i]+cupVolume[i-1]+ memo[i-3]){
//             memo[i] = cupVolume[i]+cupVolume[i-1]+ memo[i-3];
//         }
     }
        System.out.println(memo[cupNumber]);
    }


}
