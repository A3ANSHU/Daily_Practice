import java.util.*;
class Solution {
    static List<Integer> findWordsContaining(String[] words, char x) {
        List <Integer> l = new ArrayList<>();
        for (int i=0 ; i<words.length ; i++){
            if(words[i].contains(""+x)){
                l.add(i);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"leet","code"},'e'));
    }
}