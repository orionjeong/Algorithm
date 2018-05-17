public class 회전배열 {
    public static void main(String args[]){

        int result[] = 회전배열.solution(new int[]{1,2,3,4,5}, 3);

    }
    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int length=A.length;
        for(int i =0; i<K; i++){
            int temp = A[length-1];
            for(int j=0; j<length; j++){
                if(j==length-1){
                    A[0]= temp;
                }else{
                    A[length-j-1]=A[length-j-2];
                }
            }
        }

        return A;
    }
}
