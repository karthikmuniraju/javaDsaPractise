public class LeetCodeDay2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int i = 0;

            for(int j = 1; j < nums.length; ++j) {
                if (nums[j] != nums[i]) {
                    ++i;
                    nums[i] = nums[j];
                    System.out.println(nums[j]);
                }
            }

            return i + 1;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        this.reverse(nums, 0, n - 1);
        this.reverse(nums, 0, k - 1);
        this.reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            ++start;
            --end;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        LeetCodeDay2 leetCodeDay2 = new LeetCodeDay2();
        leetCodeDay2.removeDuplicates(arr);
    }
}
