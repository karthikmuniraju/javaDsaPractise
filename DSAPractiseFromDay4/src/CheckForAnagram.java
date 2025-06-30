public class CheckForAnagram {
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        int[] count =new int[26];
        for(char c : s.toCharArray()) count[c-'a']++;
        for(char c: t.toCharArray()){
            count[c-'a']--;
            if(count[c-'a']<0)return false;

        }
        return true;
    }

    public static void main(String[] args) {
        String s= "rat",t="cat";
        boolean result = isAnagram(s,t);
        System.out.println(result);
    }
}
