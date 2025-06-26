public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 2, 6, 9, 0};
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum number in the array is : " + max + "\n the minimum number inb the array is :" + min);
    }
}

