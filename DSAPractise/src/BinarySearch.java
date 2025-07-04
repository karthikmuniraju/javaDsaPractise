public class BinarySearch {
    public static int search(int[] arr,int target){
        int low=0;int high= arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target)low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int index=search(arr,3);
        System.out.println(index);
    }
}
