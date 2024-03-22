import java.util.Arrays;

class Solution {
    static boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        String s = Arrays.toString(nums);
        int in = s.lastIndexOf(target+"");
        System.out.println(s);
        if(s.contains(target+"") && s.charAt(in-1)!='-')return true;
        else return false;
    }
    public static void main(String[] args) {
      System.out.println(search(new int[]{2,5,6,0,0,1,-2},0));  
    }
}