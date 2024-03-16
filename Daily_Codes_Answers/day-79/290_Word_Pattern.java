import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    static boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" ");
        if(pattern.length()!=arr.length)return false;
        Set <String>set= new HashSet<>();
        for(String str:arr){set.add(str);}
        Map <Character,String> map = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            if(map.get(pattern.charAt(i))==null)map.put(pattern.charAt(i), arr[i]);
            else if(!map.get(pattern.charAt(i)).equals(arr[i]))return false;
        }
        
        return set.size()==map.size() ;
    }
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}