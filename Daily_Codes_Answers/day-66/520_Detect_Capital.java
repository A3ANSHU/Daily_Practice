class Solution {
    static boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word) || word.toLowerCase().equals(word)  || word.substring(1).toLowerCase().equals(word.substring(1)))return true;
        return false;
    }
    public static void main(String[] args) {
        // System.out.println(detectCapitalUse("USA"));
        // System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("Leetcode"));

    }
}