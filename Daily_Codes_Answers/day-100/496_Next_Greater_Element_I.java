import java.util.Arrays;

class Solution {
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0 ; i<nums1.length ; i++){
            for(int j=0 ; j<nums2.length ; j++){
                System.out.print((nums1[i]==nums2[j])+" ");
                System.out.println((j>nums2.length-1)+" ");
                // System.out.println(nums2[j+1]>nums1[i]);
                // if(nums1[i]==nums2[j] && j!=nums2.length-1 && nums2[j+1]>nums1[i]){
                //     nums1[i]=nums2[j+1];
                // }else{
                //     nums1[i]=-1;
                // }
            }
        }
        return nums1;
    }
    public static void main(String[] args) {
       System.out.println(Arrays.toString(nextGreaterElement(new int []{4,1,2},new int []{1,3,4,2}))); 
    }
}