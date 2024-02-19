import java.util.Arrays;

class Solution {
    static String reversePrefix(String word, char ch) {
        char []arr = word.toCharArray(); 
        int index = word.indexOf(ch);
        for(int i=0; i<index ;i++,index--){
            char c = arr[i];
            arr[i] = arr[index];
            arr[index] = c;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
        System.out.println(reversePrefix("xyxzxe",'z'));
        System.out.println(reversePrefix("abcd", 'z'));
    }
}