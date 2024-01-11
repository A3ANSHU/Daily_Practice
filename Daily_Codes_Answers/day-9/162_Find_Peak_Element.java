import java.util.Arrays;
class Anshu{
    static int findPeakElement(int[] nums) {
        
        int start=0;
        int end = nums.length-1;
        int mid=0;
        while(start<end){
            mid = start + (end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int test_case_1[] = new int[]{1,2,3,1};
        int test_case_2[] = new int[]{1,2,1,3,5,6,4};

        System.out.println("-- test case 1 --");
        System.out.println("Input : "+Arrays.toString(test_case_1)+"\nOutput : "+findPeakElement(test_case_1));
        System.out.println("-- test case 2 --");
        System.out.println("Input : "+Arrays.toString(test_case_2)+"\nOutput : "+findPeakElement(test_case_2));
    }
}