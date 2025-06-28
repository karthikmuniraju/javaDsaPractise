public class NumArray {
    int [] prefix;
    public NumArray(int [] nums){
        prefix = new int [nums.length];

        prefix[0]=nums[0];
        for(int i=1;i< nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

    }
    public int sumRange(int left,int right){
        if(left==0)return prefix[right];
        return prefix[right]-prefix[left-1];
    }

    public static void main(String[] args) {
        int[] nums={-2, 0, 3, -5, 2, -1};
        NumArray numArray= new NumArray(nums);
       int result= numArray.sumRange(0,2);
        System.out.println(result);
    }
}
