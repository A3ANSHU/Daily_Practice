import java.util.Arrays;

class Anshu{
    static int duplicate(int nums[]){
        int k=1;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int test_case_1[] = new int[]{1,1,2};
		int test_case_2[] = new int[]{0,0,1,1,1,2,2,3,3,4};

		System.out.println("--- test case 1 ---");
        int size_1 = duplicate(test_case_1);
		System.out.print("Input: nums = "+Arrays.toString(test_case_1)+"\nOutput: [");
        for(int i=0 ; i<size_1-1 ; i++){
            System.out.print(test_case_1[i]+", ");
        }
        System.out.println(test_case_1[size_1-1]+"]");

        System.out.println("--- test case 2 ---");
        int size_2 = duplicate(test_case_2);
		System.out.print("Input: nums = "+Arrays.toString(test_case_2)+"\nOutput: [");
        for(int i=0 ; i<size_2-1 ; i++){
            System.out.print(test_case_2[i]+", ");
        }
        System.out.println(test_case_2[size_2-1]+"]");
    }
}