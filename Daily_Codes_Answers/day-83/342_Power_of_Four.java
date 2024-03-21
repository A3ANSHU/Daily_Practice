class Solution {
    static boolean isPowerOfFour(int n) {
        if(n==1)return true;
        if(n<4 || n%4!=0)return false;
        while(n>4){
            if((n/4)%4!=0)return false;
            n/=4;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }

}