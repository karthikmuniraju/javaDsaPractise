import java.util.Arrays;

public class DayOnePractise {
    public void traverseArray(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

    public void findMinMaxOfGivenArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The minimum number present in array is : " + min + "\n The maximum number present in the array is : " + max);
    }

    public void reverseTheArrayInLine(int[] arr) {
        int start = 0;

        for(int end = arr.length - 1; end > start; --end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
        }

        System.out.println("the reverse array is " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 34, 56, 78, 900};
        DayOnePractise practise = new DayOnePractise();
        practise.traverseArray(arr);
        practise.findMinMaxOfGivenArray(arr);
        practise.reverseTheArrayInLine(arr);
    }
}
