import java.util.Arrays;

class Solution {
    static int[] diStringMatch(String s) {
        int i=0;
        int j=s.length();

        int arr[] = new int[s.length()+1];
        for(int k=0 ; k<s.length() ; k++){
            if(s.charAt(k)=='I')arr[k]=i++;
            else arr[k]=j--;
        }
        arr[s.length()]=i;
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("III")));
    }
}