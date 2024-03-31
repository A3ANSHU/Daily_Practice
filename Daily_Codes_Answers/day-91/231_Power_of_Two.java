class Solution {
    static boolean isPowerOfTwo(int n) {
        if(n<1)return false;
        while(n>2){
            int temp = n/2;
            if (temp*2!=n)return false;
            n=temp;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}