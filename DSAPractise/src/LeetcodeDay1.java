import java.util.Arrays;

public class LeetcodeDay1 {
    public int findMin(int[] nums) {
    int min=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    public void reverseArray(int arr[]) {
        // code here
        int start=0; int end=arr.length-1;
        while(end>start){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,9};
        LeetcodeDay1 solutions=new LeetcodeDay1();
        solutions.reverseArray(arr);
    }
}
