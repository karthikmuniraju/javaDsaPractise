import java.util.HashMap;
import java.util.Map;

public class LeetcodeDay5 {
    static class NumArray{
        int[] prefix;
        public NumArray(int[] nums){
            prefix= new int[nums.length];
            prefix[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                prefix[i]=prefix[i-1]+nums[i];
            }
        }
        public int sumRange(int left, int right) {
            if(left==0) return prefix[right];
            return prefix[right]-prefix[left-1];
        }
    }
        public  int subarraySum(int[] nums, int k) {
            Map<Integer,Integer>map=new HashMap<>();
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
    static int maxLen(int arr[]) {
        // code here
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0,maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxLen=i+1;

            }
            else if(map.containsKey(sum)){
                maxLen=Math.max(maxLen,i-map.get(sum));
            }
            map.put(sum,i);
        }
        return maxLen;

    }

//    public static void main(String[] args) {
////        int [] nums={-2, 0, 3, -5, 2, -1};
////        NumArray numArray=new NumArray(nums);
////        int result = numArray.sumRange(2,5);
////        System.out.println(result);
////    int[] nums={1,1,1};
////    int result = subarraySum(nums,2);
////        System.out.println(result);
//    }
}
