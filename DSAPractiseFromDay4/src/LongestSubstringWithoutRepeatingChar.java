import java.util.HashSet;
//import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static int lengthOfLongestSubstring(String s){
        Set<Character>set=new HashSet<>();
        int left=0,right=0,max=0;
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                max= Math.max(max,set.size());
            }else{
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        int result=lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
