import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSor(int[] arr){
        int[] sortedArray=arr.clone();
        for(int i=0;i<arr.length-1;i++){
            int minIdx=i;
            for(int j=i+1;j< arr.length;j++){
                if(sortedArray[j]<sortedArray[minIdx]){
                    minIdx=j;
                }
            }
            int temp=sortedArray[i];
            sortedArray[i]=sortedArray[minIdx];
            sortedArray[minIdx]=temp;

        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] arr={1,5,4,6,3};
        int[] result=selectionSor(arr);
        System.out.println(Arrays.toString(result));
    }
}
