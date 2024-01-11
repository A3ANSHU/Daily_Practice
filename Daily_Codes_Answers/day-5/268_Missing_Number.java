import java.util.Arrays;

class Anshu{
    static int missingNumber(int[] nums) {
        int total=0;
        for(int i=0 ; i<nums.length ; i++){
            total+=nums[i];
        }
        return ((nums.length*(nums.length+1))/2)-total;
    }
    public static void main(String[] args) {
        
        int test_case_1[] = new int[]{3,0,1};
        int test_case_2[] = new int[]{0,1};
        int test_case_3[] = new int[]{9,6,4,2,3,5,7,0,1};
        
        System.out.println("-- test case 1 --");
        System.out.println("Input : "+Arrays.toString(test_case_1)+"\nOutput : "+missingNumber(test_case_1));
        System.out.println("-- test case 2 --");
        System.out.println("Input : "+Arrays.toString(test_case_2)+"\nOutput : "+missingNumber(test_case_2));
        System.out.println("-- test case 3 --");
        System.out.println("Input : "+Arrays.toString(test_case_3)+"\nOutput : "+missingNumber(test_case_3));
    }
}