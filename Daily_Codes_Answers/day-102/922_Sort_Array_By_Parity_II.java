import java.util.Arrays;

class Solution {
    static int[] sortArrayByParityII(int[] nums) {
        int arr[] = new int[nums.length];
        int i=0;
        int j=1;
        for (int k=0 ; k<nums.length ; k++){
            if(nums[k]%2==0){
                arr[i]=nums[k];
                i++;
                i++;
            }else{
                arr[j]=nums[k];
                j++;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
    }
}