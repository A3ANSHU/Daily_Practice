class Anshu{
    static int factorial(int s){
        int num=1;
        for(int i=s ; i>=1 ;i--){
            num*=i;
        }
    return num;
    }
    static int climbStairs(int n) {
        int step =1;
        int temp =n;
        for(int i = 1 ; i<=temp/2 ; i++){
            int num = factorial(n-1)/(factorial(i)*factorial(n-1-i));
            step+=num;
            n--;
        }
        return step;
    }
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 6;

        System.out.println("-- test case 1 --");
        System.out.println("Input : "+n1+"\nOutput : "+climbStairs(n1));
        System.out.println("-- test case 2 --");
        System.out.println("Input : "+n2+"\nOutput : "+climbStairs(n2));
    }
}
