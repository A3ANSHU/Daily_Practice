class Solution {
    static int[] intersection(int[] nums1, int[] nums2) {
        String n1 = nums1.toString();
        String n2 = nums2.toString();
        StringBuffer temp = new StringBuffer();
        for(char c: n1.toCharArray()){
            if(n2.contains(c+""))temp.append(c);
        }
        System.out.println(temp);
        return new int[1];
    }
    public static void main(String[] args) {
        
    }
}