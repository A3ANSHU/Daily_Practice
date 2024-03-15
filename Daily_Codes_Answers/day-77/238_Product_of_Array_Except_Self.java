import java.util.Arrays;

class Solution {
    static int[] productExceptSelf(int[] nums) {
        long sol=1;
        int count0=0;
        int index=-1;
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]!=0)sol*=nums[i];
            else {
                count0++;
                index=i;
            }
            if(count0==2)return new int[nums.length];
        }
        if(count0==1){
            nums = new int[nums.length];
            nums[index]=(int)sol;
        }else{
            for (int i=0 ; i<nums.length;i++){
                nums[i]=(int)sol/nums[i];
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
}