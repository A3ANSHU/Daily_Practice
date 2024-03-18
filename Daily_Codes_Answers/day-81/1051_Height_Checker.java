import java.util.Arrays;

class Solution {
    static int heightChecker(int[] heights) {
        int []heights2 = heights.clone(); 
        Arrays.sort(heights2); 
        int count=0;
        for(int i=0 ; i<heights.length; i++){
            if(heights[i]!=heights2[i])count++;
        }
        return count;
    }
    public static void main(String[] args) {
       System.out.println(heightChecker(new int[]{1,1,4,2,1,3})); 
    }
}