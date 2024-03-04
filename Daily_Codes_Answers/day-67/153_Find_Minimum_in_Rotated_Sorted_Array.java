class Solution {
    static int findMin(int[] nums) {
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]<nums[i-1])return nums[i];
        }
        return nums[0];
    }
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
        System.out.println(findMin(new int[]{11,13,15,17}));
    }
}