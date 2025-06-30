import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>>map =new HashMap<>();
        for(String s:strs){
            char[] arr =s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] str={"eat","tea","tan","ate","nat","bat"};
        List<List<String>>reult =groupAnagrams(str);
        System.out.println(reult);
    }
}
