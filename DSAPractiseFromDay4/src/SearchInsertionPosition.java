public class SearchInsertionPosition {
    public static int insertPosition(int[] nums,int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target)low=mid+1;
            else high=mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        int nums[]={1,3,4,5};
       int result = insertPosition(nums,2);
        System.out.println(result);
    }
}
