//TLE

class Anshu{
    static int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        int count =0;
        for(int i = 2 ; i<n ;i++){
            boolean prime = true;
            for(int j = 2 ; j<i ; j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime==true){
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int test_case_1 = 10000;
        int test_case_2 = 1;
        int test_case_3 = 0;

        System.out.println("-- test case 1 --");
        System.out.println("Input : "+test_case_1+"\nOutput : "+countPrimes(test_case_1));
        System.out.println("-- test case 2 --");
        System.out.println("Input : "+test_case_2+"\nOutput : "+countPrimes(test_case_2));
        System.out.println("-- test case 3 --");
        System.out.println("Input : "+test_case_3+"\nOutput : "+countPrimes(test_case_3));

    }
}