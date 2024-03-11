import java.util.Arrays;

class Solution {
    static void rotate1(int[] nums, int k) {
        while(k!=0){
            int temp = nums[nums.length-1];
            for(int i=nums.length-1; i>0 ; i--){
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
            k--;
        } 
        System.out.println(Arrays.toString(nums));
    }
    static void rotate2(int[] nums, int k) {
        if(nums.length>1){
            int [] arr = new int[nums.length];
            k%=nums.length;
            for(int i=0; i<arr.length ; i++,k++){
                if(k==nums.length)k=0;
                arr[k] = nums[i];
            }
            for(int i=0; i<arr.length ; i++){
                nums[i]=arr[i];
            } 
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        // rotate1(new int[]{1,2,3,4,5,6,7}, 3);
        rotate2(new int[]{1,2,3,4,5,6,7}, 7);
    }
}
