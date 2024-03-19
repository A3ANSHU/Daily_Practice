import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    static boolean isIsomorphic(String s, String t) {
        Map <Character,Character>map = new HashMap<>();
        for(int i=0 ; i<s.length();i++){
            if(map.get(s.charAt(i))==null)map.put(s.charAt(i), t.charAt(i));
            else if(map.get(s.charAt(i))!=t.charAt(i))return false;
        }
        Set<Character>set = new HashSet<>(); 
        for(char c : map.values()){
            set.add(c);
        }
        return map.size()==set.size();
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }
}