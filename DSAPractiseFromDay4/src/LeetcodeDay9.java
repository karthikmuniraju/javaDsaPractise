import java.util.*;

public class LeetcodeDay9 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result = new ArrayList<>();
        if(p.length()>s.length())return result;
        int[] countP=new int[26];
        int[] countS=new int[26];
        for(int i=0;i<p.length();i++){
            countP[p.charAt(i)-'a']++;
            countS[s.charAt(i)-'a']++;

        }
        if(Arrays.equals(countP,countS))result.add(0);
        for(int i=p.length();i<s.length();i++){
            countS[s.charAt(i)-'a']++;
            countS[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(countP,countS))result.add(i-p.length()+1);
        }
        return result;
    }
    static List<Integer> firstNegInt(int arr[], int k) { //this is geek for geeks problem
        // write code here
        List<Integer>result= new ArrayList<>();
        Deque<Integer>dq=new ArrayDeque<>();
        int i=0,j=0;
        while(j< arr.length){
            if(arr[j]<0) dq.add(arr[j]);
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                if(!dq.isEmpty()) result.add(dq.peek());
                else result.add(0);
                if(!dq.isEmpty()&&arr[i]==dq.peek()) dq.poll();
                i++;
                j++;
            }

        }
        return result;
    }
}
