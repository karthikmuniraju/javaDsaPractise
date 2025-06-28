import java.util.HashMap;
import java.util.Map;

public class MaximumSubarraySumisK {
    public static int suubArraySum(int[] nums,int k){
        Map<Integer,Integer>map =new HashMap<>();
        map.put(0,1);
        int sum=0;int count=0;
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;

    }

    public static void main(String[] args) {
        int[] nums={1,1,1};
       int result= suubArraySum(nums,2);
        System.out.println(result);
    }
}
