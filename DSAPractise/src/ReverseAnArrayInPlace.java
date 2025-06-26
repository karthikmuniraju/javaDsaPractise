import java.util.Arrays;

public class ReverseAnArrayInPlace {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 7, 8, 3};
        int start = 0;

        for(int end = arr.length - 1; end > start; --end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
        }

        System.out.println(Arrays.toString(arr));
    }
}
