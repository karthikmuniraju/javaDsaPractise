import java.util.Arrays;

public class LeetCodeDay1 {
    public int findMin(int[] nums) {
        int min = nums[0];

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }

    public void reverseArray(int[] arr) {
        int start = 0;

        for (int end = arr.length - 1; end > start; --end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 6, 7, 9};
        LeetCodeDay1 solutions = new LeetCodeDay1();
        solutions.reverseArray(arr);
    }
}
