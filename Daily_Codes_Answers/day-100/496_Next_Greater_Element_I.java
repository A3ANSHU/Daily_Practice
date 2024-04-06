import java.util.Arrays;

class Solution {
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0 ; i<nums1.length ; i++){
            boolean find = false;
            int max=nums1[i];
            for(int j=0 ; j<nums2.length ; j++){
                if(nums1[i]==nums2[j])find=true;
                if(find && nums2[j]>max){
                    max=nums2[j];
                    break;
                }
            }
            if(max==nums1[i])nums1[i]=-1;
            else nums1[i]=max;
        }
        return nums1;
    }
    public static void main(String[] args) {
       System.out.println(Arrays.toString(nextGreaterElement(new int []{4,1,2},new int []{1,3,4,2}))); 
    }
}