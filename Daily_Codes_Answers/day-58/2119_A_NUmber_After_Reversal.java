class Solution {
    static boolean isSameAfterReversals(int num) {
        return num==0 || num%10!=0;
    }
	public static void main(String[] args) {
		System.out.println(isSameAfterReversals(526));
		System.out.println(isSameAfterReversals(1800));
		System.out.println(isSameAfterReversals(0));
	}
}