import java.util.Arrays;

class Anshu{
    static int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length-1 ; i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
    return nums[nums.length-1];   
    }
    public static void main(String[] args) {
        
        int test_case_1[] = new int[]{2,2,1};
        int test_case_2[] = new int[]{4,1,2,1,2};
        int test_case_3[] = new int[]{1};

        System.out.println("-- test case 1 --");
        System.out.println("Input : "+Arrays.toString(test_case_1)+"\nOutput : "+singleNumber(test_case_1));
        System.out.println("-- test case 2 --");
        System.out.println("Input : "+Arrays.toString(test_case_2)+"\nOutput : "+singleNumber(test_case_2));
        System.out.println("-- test case 3 --");
        System.out.println("Input : "+Arrays.toString(test_case_3)+"\nOutput : "+singleNumber(test_case_3));
    }
}