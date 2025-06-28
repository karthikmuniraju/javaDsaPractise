import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithSum0 {
   static int maxLenZeroSum(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxLen=i+1;
            }
            else if(map.containsKey(sum)){
                maxLen=Math.max(maxLen,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
       int result= maxLenZeroSum(arr);
        System.out.println(result);
    }
}
