import java.util.*;

public class LeetcodeDay6 {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())return false;
    int[] count = new int[26];
    for(char c:s.toCharArray())count[c-'a']++;
    for(char c:t.toCharArray()){
        count[c-'a']--;
        if(count[c-'a']<0)return false;
    }
    return true;
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->freq.get(b)-freq.get(a));
        pq.addAll(freq.keySet());
        int result[]=new int[k];
        for(int i=0;i<k;i++){
            result[i]=pq.poll();
        }
        return result;
    }
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set = new HashSet<>();
        int left =0,right =0,max=0;
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                max=Math.max(max, set.size());
            }else{
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char[] ch= s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
