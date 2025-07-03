import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class FirstNegativeInWindow {
    public  static List<Integer> firstNegative(int[] arr,int k){
        List<Integer> result= new ArrayList<>();
        Deque<Integer> dq= new ArrayDeque<>();
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]<0){
                dq.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                if(!dq.isEmpty()){
                    result.add(dq.peek());
                }else result.add(0);
                if(!dq.isEmpty()&&arr[i]==dq.peek()) dq.poll();
                j++;
                i++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, 15, 30, 16, 28};
        int k = 3;
        System.out.println(firstNegative(arr,k));
    }
}
