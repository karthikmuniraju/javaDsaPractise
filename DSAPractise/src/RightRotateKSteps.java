import java.util.Arrays;

public class RightRotateKSteps {
    public void reverseArray(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        System.out.println(k);
        this.rotateArray(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
        this.rotateArray(arr, 0, k);
        System.out.println(Arrays.toString(arr));
        this.rotateArray(arr, k, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void rotateArray(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
            --end;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        RightRotateKSteps rotate = new RightRotateKSteps();
        rotate.reverseArray(arr, 3);
    }
}
