public class countPrefixSum {
    public static int countPrefixSum(int arr[],int k){
        int count=0, sum=0;
        for(int num:arr){
            sum+=num;
            if(sum==k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1};
        int result = countPrefixSum(nums,2);
        System.out.println(result);
    }
}
