import java.util.HashSet;

class Solution {
    static boolean buddyStrings(String s, String goal) {
        if (s.length()!=goal.length())return false;

        HashSet<Character> hs = new HashSet<>();
        for(char c: s.toCharArray()){hs.add(c);}
        if(s.length() != hs.size() && s.equals(goal))return true;
        
        int x=-1,y=-1;
        int cnt=0;
        for(int i=0 ; i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                cnt++;
                x=y;
                y=i;
            }
            if(cnt>2)return false;
        }
        if(cnt==2 && s.charAt(x)==goal.charAt(y) && s.charAt(y)==goal.charAt(x))return true;
        
        return false;
    }
    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ab"));
    }
}