public class CheckIfArrayIsSorted {
    public static boolean check(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)% nums.length]){
                count++;
            }
        }
        return count<=1;
    }

    public static void main(String[] args) {
        int arr[] ={3,4,5,1,2};
        boolean result= check(arr);
        System.out.println(result);
    }
}
