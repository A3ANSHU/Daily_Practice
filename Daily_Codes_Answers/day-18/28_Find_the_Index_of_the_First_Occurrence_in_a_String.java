class Solution {
    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        
        String haystack1 = "sadbutsad";  
        String needle1 = "sad";
        String haystack2 = "leetcode"; 
        String needle2 = "leeto";

        System.out.println("-- test case 1 --");
        System.out.println("Input : haystack - "+haystack1+" needle - "+needle1+"\nOutput : "+strStr(haystack1, needle1));

        System.out.println("-- test case 2 --");
        System.out.println("Input : haystack - "+haystack2+" needle - "+needle2+"\nOutput : "+strStr(haystack2, needle2));
    }
}