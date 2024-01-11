import java.util.Arrays;
class Anshu{
    static void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for(int num: nums){
            if(num==0)
                zero++;
            if(num==1)
                one++;
            if(num==2)
                two++;
        }
        int i=0;
        while(zero!=0 || one!=0 || two!=0){
            if(zero!=0){
                nums[i]=0;
                zero--;
            }else if(one!=0){
                nums[i]=1;
                one--;
            }else{
                nums[i]=2;
                two--;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        
        int test_case_1[] = new int[]{2,0,2,1,1,0};
        int test_case_2[] = new int[]{2,0,1};
        
        System.out.println("-- test case 1 --");
        System.out.print("Input : "+Arrays.toString(test_case_1)+"\nOutput : ");
        sortColors(test_case_1);
        System.out.println(Arrays.toString(test_case_1));
        System.out.println("-- test case 2 --");
        System.out.print("Input : "+Arrays.toString(test_case_2)+"\nOutput : ");
        sortColors(test_case_2);
        System.out.println(Arrays.toString(test_case_2));
    }
}