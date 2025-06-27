import java.util.Arrays;

public class LeetCodeDay4 {
    public int[] twoSum(int[] nums, int target) { //for sorted 1-indexed array
        int left =0; int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target)return new int[]{left,right};
            else if(sum<target) left++;
            else right--;
        }
        return new int[]{-1,-1};
    }
    public int findMin(int[] nums) { // finding the number using binary search
        int low=0;int high=nums.length-1;
        while (low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[high]){
                high=mid;
            }
            else if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high--;
            }
        }
        return nums[low];
    }

    public static double findMaxAverage(int[] nums, int k) {
    double maxSum=0; double windowSum=0;
    for(int i=0;i<k;i++){
        windowSum+=nums[i];

    }
    maxSum=windowSum;
    for(int i=k;i<nums.length;i++){
        windowSum+=nums[i]-nums[i-k];
        maxSum=Math.max(windowSum,maxSum);
    }
    return maxSum/k;
    }
    public boolean check(int[] nums) {
    int count=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>nums[(i+1)%nums.length]){
            count ++;
        }
    }
    return count<=1;
    }

//    public static void main(String[] args) {
//        int[] nums={1,12,-5,-6,50,3};
//        double result = findMaxAverage(nums,4);
//        System.out.println(result);
//    }
}
