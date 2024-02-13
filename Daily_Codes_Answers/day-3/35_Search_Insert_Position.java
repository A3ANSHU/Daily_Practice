import java.util.Arrays;
class Anshu{
    static int position(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (nums[mid] == target){
                return mid;
            }if(nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int test_case_1[] = new int[]{1,3,5,6};
		int target_1 = 5;
		int test_case_2[] = new int[]{1,3,5,6};
		int target_2 = 2;
		int test_case_3[] = new int[]{1,3,5,6};
		int target_3 = 7;

        System.out.println("--- test case 1 ---");
		System.out.println("Input: nums = "+Arrays.toString(test_case_1)+" , Target = "+target_1+"\nOutput: "+position(test_case_1,target_1));
		System.out.println("--- test case 3 ---");
		System.out.println("Input: nums = "+Arrays.toString(test_case_2)+" , Terget = "+target_2+"\nOutput: "+position(test_case_2,target_2));
		System.out.println("--- test case 3 ---");
		System.out.println("Input: nums = "+Arrays.toString(test_case_3)+" , Terget = "+target_3+"\nOutput: "+position(test_case_3,target_3));
	

    }
}