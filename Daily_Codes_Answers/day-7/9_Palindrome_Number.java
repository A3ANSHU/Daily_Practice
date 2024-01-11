class Anshu{
    static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=0;
        int x1=x;
        while(x1!=0){
            temp = temp*10+(x1%10);
            x1/=10;
        }
        if(temp==x){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        int test_cse_1 = 121;
        int test_cse_2 = -121;
        int test_cse_3 = 10;

        System.out.println("-- test case 1 --");
        System.out.println("Input : "+test_cse_1+"\nOutput : "+isPalindrome(test_cse_1));
        System.out.println("-- test case 2 --");
        System.out.println("Input : "+test_cse_2+"\nOutput : "+isPalindrome(test_cse_3));
        System.out.println("-- test case 3 --");
        System.out.println("Input : "+test_cse_3+"\nOutput : "+isPalindrome(test_cse_3));
    }
}