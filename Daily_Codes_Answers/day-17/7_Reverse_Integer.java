class Anshu {
    static int reverse(int x) {
        long rev=0;
        while(x!=0){
            int rem = x%10;
            rev = rev*10+rem;
            x= x/10;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE)
        return 0;
        else
        return (int)rev;
    }
    public static void main(String[] args) {
        int x1 = 123;       
        int x2 = -123;
        int x3 = 120; 
        
        System.out.println("-- test case 1 --");
        System.out.println("Input : "+x1+"\nOutput : "+reverse(x1));
        System.out.println("-- test case 2 --");
        System.out.println("Input : "+x2+"\nOutput : "+reverse(x2));
        System.out.println("-- test case 3 --");
        System.out.println("Input : "+x3+"\nOutput : "+reverse(x3));
    }
}