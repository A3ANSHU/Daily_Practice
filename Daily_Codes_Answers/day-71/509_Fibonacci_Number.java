class Solution {
    static int fib(int n) {
        if(n==0)return 0;
        int n1=0;
        int n2=1;
        int f=n1+n2;
        while(n>1){
            f=n1+n2;
            n1=n2;
            n2=f;   
            n--;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}