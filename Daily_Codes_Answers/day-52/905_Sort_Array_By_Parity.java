import java.util.Arrays;

class Solution {
    static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            if(nums[start]%2!=0 && nums[end]%2==0){
                int temp = nums[start];
                nums[start]=nums[end];
                nums[end]= temp;
            }
            if(nums[start]%2==0){
                start++;
            }
            if(nums[end]%2!=0){
                end--;
            }
        }
        return nums; 
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,2,4};

        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}