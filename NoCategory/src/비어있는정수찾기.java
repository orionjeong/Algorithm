import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 비어있는정수찾기 {
    public static void main(String args[]){
        System.out.println(solution(new int[]{1,2,3,5}));
    }
    public static int solution(int[] A) {
        int status=-1;
        List<Integer> list= new ArrayList<Integer>(Arrays.stream(A).boxed().collect(Collectors.toList()));
        for(int i=1; i<A.length+1; i++){
            if(!list.contains(i)){
                status = i;
            }
        }

        return status;

    }
}
