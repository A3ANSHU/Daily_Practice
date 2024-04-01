import java.util.Arrays;

class Solution {
    static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=1;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1,4,3,2}));
    }
}