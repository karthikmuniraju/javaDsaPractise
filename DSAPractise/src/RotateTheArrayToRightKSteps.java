import java.util.Arrays;

public class RotateTheArrayToRightKSteps {
    public void reverseArray(int[] arr,int k){
        int n=arr.length;
        k=k%n; //to ensure no out of bound
        System.out.println(k);

        rotateArray(arr,0,n-1); //rotate full array
        System.out.println(Arrays.toString(arr));
        rotateArray(arr,0,k);//rotating till kth element
        System.out.println(Arrays.toString(arr));
        rotateArray(arr,k,n-1);
        System.out.println(Arrays.toString(arr));

    }
    public void rotateArray(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        RotateTheArrayToRightKSteps rotate=new RotateTheArrayToRightKSteps();
        rotate.reverseArray(arr,3);

    }
}
