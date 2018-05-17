import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListTest {

    public static void main(String args[]){
        List<String> all = new ArrayList<>();
        String[] test ={"aa", "bb","cc"};
        Collections.addAll(all, test);
        int[] A = {1,2,3,4,6};

        for(int i=0; i< all.size(); i++){
            System.out.println(all.get(i));
        }
        String[] test2 = all.toArray(new String[all.size()]);

        for(int i=0; i< test2.length; i++){
            System.out.println(test2[i]);
        }
        List<Integer> list= new ArrayList<Integer>();


        System.out.println(list.get(0));
//        for(int i=0; i<A.length; i++){
//            if(!list.contains(i)){
//                return list.get(i);
//            }
//        }
    }
}
