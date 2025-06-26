import java.util.Arrays;

public class DayOnePreactiseClass {
    public void traverseArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void findMinMaxOfGivenArray(int[] arr){
        int max=arr[0]; int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The minimum number present in array is : "+min+"\n The maximum number present in the array is : "+ max);
    }
    public void reverseTheArrayInLine(int[] arr){
        int start=0; int end=arr.length-1;
        while(end>start){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        System.out.println("the reverse array is "+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr ={2,4,34,56,78,900};
        DayOnePreactiseClass practise= new DayOnePreactiseClass();
        practise.traverseArray(arr);
        practise.findMinMaxOfGivenArray(arr);
        practise.reverseTheArrayInLine(arr);
    }

}
