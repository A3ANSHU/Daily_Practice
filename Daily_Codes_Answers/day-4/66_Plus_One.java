import java.util.Arrays;
class Anshu{
    static int[] plus_one(int digits[]){
        for(int i=digits.length-1 ; i>=0 ;i-- ){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args) {
        int test_case_1[] = new int[]{1,2,3};
		int test_case_2[] = new int[]{4,3,2,1};
        int test_case_3[] = new int[]{9};

        System.out.println("--- test case 1 ---");
        System.out.println("Input: nums = "+Arrays.toString(test_case_1)+"\nOutput: "+Arrays.toString(plus_one(test_case_1)));
        System.out.println("--- test case 2 ---");
        System.out.println("Input: nums = "+Arrays.toString(test_case_2)+"\nOutput: "+Arrays.toString(plus_one(test_case_2)));
        System.out.println("--- test case 3 ---");
        System.out.println("Input: nums = "+Arrays.toString(test_case_3)+"\nOutput: "+Arrays.toString(plus_one(test_case_3)));
        
    }
}