import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    static int[] topKFrequentElements(int[] arr,int k){
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);


        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        int result[] = new int[k];
        for(int i=0;i<k;i++){
            result[i]=pq.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,1,2,2,3};
        int[] result =topKFrequentElements(arr,2);
        System.out.println(Arrays.toString(result));
    }
}
