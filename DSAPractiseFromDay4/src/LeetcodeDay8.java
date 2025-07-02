import java.util.Arrays;
//public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

public class LeetcodeDay8 {
    public int[] sortArray(int[] nums) {
//        int[] copy=nums.clone(); //easy way using Arryas.sort method
//        Arrays.sort(copy);
//        return copy;
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int arr[],int left,int right){
        if(left>=right)return;
        int mid=(right+left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);

    }
    public void merge(int arr[],int left,int mid,int right){
        int temp[] = new int[right-left+1];
        int i=left,j=mid+1,k=0;
        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];

            }else temp[k++]=arr[j++];
        }
        while (i<=mid)temp[k++]=arr[i++];
        while (j<=right)temp[k++]=arr[j++];
        for(int x=0;x<temp.length;x++){
            arr[left+x]=temp[x];
        }
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy= new ListNode(0);
        ListNode curr=head;
        while(curr!=null){
            ListNode prev=dummy;
            while(prev.next!=null&&prev.next.val<curr.val){
                prev=prev.next;
            }
            ListNode next=curr.next;
            curr.next=prev.next;
            prev.next=curr;
            curr=next;
        }
        return dummy.next;

    }
}
