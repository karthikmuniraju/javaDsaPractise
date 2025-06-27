public class FindMinimunInRotatedArray {
    public static int findMin(int[] arr){
        int low =0; int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high]){ // checking if number at mid is lesser or greater
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return arr[low];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        int lowest = findMin(nums);
        System.out.println(lowest);
    }
}
