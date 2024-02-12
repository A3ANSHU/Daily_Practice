import java.util.*;
class Anshu{
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int x=n+m-1;
        while(i>=0 || j>=0){
            if(i>=0 && j>=0){
                if(nums1[i]>nums2[j]){
                    nums1[x] = nums1[i];
                    i--;
                }else{
                    nums1[x] = nums2[j];
                    j--;
                }
            }else if(i>=0){
                nums1[x] = nums1[i];
                i--;
            }else if(j>=0){
                nums1[x] = nums2[j];
                j--;
            }
            x--;
        }
        return nums1;
    }
    public static void main(String[] args) {
        
        int num1[] = new int[]{1,2,3,0,0,0};
        int m = 3;
        int num2[] = new int[]{2,3,6};
        int n = 3;
        System.out.println("-- test case 1 --");
        System.out.println("Input : num1 : "+Arrays.toString(num1)+", m : "+m+" / num2 : "+Arrays.toString(num2)+" , n : "+n+"\nOutput :"+ Arrays.toString(merge(num1,m, num2,n)));

    }
}