import java.util.*;
class Solution {
    static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int arr[] = new int[nums.length];
        for (int i=0 ; i<nums.length; i+=2){
            arr[i] = nums[i+1];
            arr[i+1] = nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr1[] = new int[]{5,4,2,3};
        int arr2[] = new int[]{2,5};

        System.out.println("-- test case 1 --");
        System.out.println("Input : "+Arrays.toString(arr1)+"\nOutput : "+Arrays.toString(numberGame(arr1)));
        System.out.println("-- test case 2 --");
        System.out.println("Input : "+Arrays.toString(arr2)+"\nOutput : "+Arrays.toString(numberGame(arr2)));
    }
}