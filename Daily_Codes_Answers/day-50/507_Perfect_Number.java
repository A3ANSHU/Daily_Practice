class Solution {

    // Aproach 1
    static boolean checkPerfectNumber(int num) {
        int sum=0;
        for (int i=1 ; i<=num/2 ; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
    }
    // Aproach 2
    static boolean checkPerfectNumber2(int num) {
        return (num==6 || num==28 || num==496 || num==8128 || num==33550336);
    }
    public static void main(String[] args) {
        int num1 = 28;
        int num2 = 7;

        System.out.println(checkPerfectNumber(num1));
        System.out.println(checkPerfectNumber2(num2));
    }
}