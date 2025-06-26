import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day2Practise {
    public void RemoveDuplicateFromSortedArray(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            i+=1;
        }
    }
    public void reverseArrayByOnePlace(int[] arr){
        int last=arr[arr.length-1];
        for(int i= arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        System.out.println("The array after rotating by one place is :"+ Arrays.toString(arr));
    }
    public int removeDuplicates(int[] nums) {
//        int result=0;
//        Set<Integer>set=new HashSet<>();
//        for(int numbers:nums){
//            set.add(numbers);
//        }
//        for(int num:set){
//            return result= num;
//        }
//        return result;
        //using for loop
        if(nums.length==0)return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;

    }
    public void reverseArrayByKplace(int[] arr,int k){
        int n= arr.length;
        k=k%n;//to check out of bound
        rotateArray(arr,0,n-1);//rotate entire array
        rotateArray(arr,0,k-1);//rotate till kth element
        rotateArray(arr,k,n-1);//rotate rest of array

        System.out.println("Reverse till kth element is"+Arrays.toString(arr));
    }
    public void rotateArray(int[] arr,int start,int end){
        while (start<end){
            int tem=arr[start];
            arr[start]=arr[end];
            arr[end]=tem;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 4, 1, 5};
        Day2Practise day2=new Day2Practise();
//        day2.RemoveDuplicateFromArray(arr);
        day2.reverseArrayByKplace(arr,3);
        day2.reverseArrayByOnePlace(arr);
       int result= day2.removeDuplicates(arr);
        System.out.println(result);
    }
}
