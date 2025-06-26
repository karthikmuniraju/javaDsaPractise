public class LeetCodeDay3 {
    public int search(int[] nums, int target) {
        int low=0; int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target)low= mid+1;
            else  high=mid-1;
        }
        return -1;
    }
    public int findPeakElement(int[] nums) {
        int low=0;int high=nums.length-1;
        while (low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    public int[] searchRange(int[] nums, int target) {
        int [] range={findFirst(nums,target),findLast(nums,target)};
        return range;

    }
    public int findFirst(int[] nums,int target){
        int low=0; int high=nums.length-1;int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int findLast(int[] arr,int target){
        int low=0; int high=arr.length-1;int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
