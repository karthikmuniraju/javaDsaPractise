import java.util.Arrays;

public class ProductArrayPuzzel {
    public static int[] productExpectSelf(int[] nums){
        int n= nums.length;
        int result[]=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=nums[i-1]*result[i-1];
        }
        int suffixProduct=1;
        for(int i=n-1;i>=0;i--){
            result[i]*=suffixProduct;
            suffixProduct*=nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(productExpectSelf(arr)));
    }
}
