import java.util.*;
class Anshu{
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int ret[] = new int[n+m];
        int i=0;
        int j=0;
        int x=0;
        while(m!=0 && n!=0){
            if(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    ret[x] = nums1[i];
                    i++;
                }else{
                    ret[x] = nums2[j];
                    j++;
                }
                x++;
            }
        }
        return new int[1];
    }
    public static void main(String[] args) {
        
        int num1[] = new int[]{1,2,3,0,0,0};
        int m = 3;
        int num2[] = new int[]{2,3,6};
        int n = 3;
        System.out.println("-- test case 1 --");
        System.out.println("Input : num1 : "+Arrays.toString(num1)+", m : "+m+" / num2 : "+Arrays.toString(num2)+" , n : "+n+"\nOutput :"+ merge(num1,m, num2,n));

    }
}