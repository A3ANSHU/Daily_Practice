import java.util.Arrays;

class Solution {
    static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=1 ; i<nums.length ; i++){
            count++;
            if(nums[i]!=nums[i-1]){
                if(count!=3)return nums[i-1];
                count=0;
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,3,2}));
        System.out.println(singleNumber(new int[]{0,1,0,1,0,1,99}));
    }
}