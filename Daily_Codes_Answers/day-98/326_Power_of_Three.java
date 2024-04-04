class Solution {
    static boolean isPowerOfThree(int n) {
        if(n<3 && n!=1)return false;
        while(n>=3){
            int temp = n/3;
            if (temp*3!=n)return false;
            n=temp;
        }
        return n==1;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}