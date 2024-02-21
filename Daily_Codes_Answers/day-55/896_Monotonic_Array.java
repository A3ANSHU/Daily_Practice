class Solution {
    static boolean isMonotonic(int[] nums) {
        boolean flag_asc = true;
        boolean flag_desc = true;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i-1]<nums[i]){
                flag_desc=false;
                if(!flag_asc)return false;
            }else if(nums[i-1]>nums[i]){
                flag_asc=false;
                if(!flag_desc)return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1,2,2,3}));
        System.out.println(isMonotonic(new int[]{6,5,4,4}));
        System.out.println(isMonotonic(new int[]{1,3,2}));
    }
}