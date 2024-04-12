import java.util.*;

class Anshu{
    static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }
    public static void main(String[] args) {
        
        String s1 = "abcabcbb";
        String s2 = "dvdf";
        String s3 = "pwwkew";

        System.out.println("-- test case 1 --");
        System.out.println("input : "+s1+"\nOutput : "+lengthOfLongestSubstring(s1));
        System.out.println("-- test case 2 --");
        System.out.println("input : "+s2+"\nOutput : "+lengthOfLongestSubstring(s2));
        System.out.println("-- test case 3 --");
        System.out.println("input : "+s3+"\nOutput : "+lengthOfLongestSubstring(s3));
    }
}