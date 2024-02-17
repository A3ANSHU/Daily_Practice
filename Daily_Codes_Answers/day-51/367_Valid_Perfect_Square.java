class Solution {
    static boolean isPerfectSquare(int num) {
        double sqr = Math. sqrt(num);
        int val = (int) sqr;
        return(val*val)==num; 
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
}