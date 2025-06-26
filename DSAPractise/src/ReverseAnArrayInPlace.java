import java.util.Arrays;

public class ReverseAnArrayInPlace {
    public static void main(String[] args) {
        int [] arr={1,4,5,7,8,3};
        int start=0; int end= arr.length-1;
        while(end>start){
            int temp=arr[start];// assaigning temp to 1st element
            arr[start]=arr[end];//interchanging 1st and end element
            arr[end]=temp;//assaigning end element to tem
            start++;//post ioncrimenting start
            end--;//post decrementiong end
        }
        System.out.println(Arrays.toString(arr));
    }
}
