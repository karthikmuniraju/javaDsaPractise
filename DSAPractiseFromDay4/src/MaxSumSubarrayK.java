public class MaxSumSubarrayK {
    public static int maxSum(int[] nums,int k){
        int maxSum=0,windowSum=0;
        for(int i=0;i<nums.length;i++){
            windowSum=nums[i];
        }
        windowSum=maxSum;
        for(int i=k;i<nums.length;i++){
            windowSum+=nums[i]-nums[i-k];
            maxSum+=Math.max(windowSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums={2,1,5,1,3,2};
        int k=3;
        System.out.println(maxSum(nums,k));
    }
}
