public class LeetcodeDay11 {
    public  int singleNumber(int[] nums) {
        int result=0;
        for(int num:nums){
            result^=num;
        }
        return result;
    }

//    public static void main(String[] args) {
//        int[] arr={4,4,5,3,3};
//        int result = singleNumber(arr);
//        System.out.println(result);
//    }
}
