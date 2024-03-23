import java.util.Arrays;

class Solution {
    static void duplicateZeros(int[] arr) {
        StringBuffer str = new StringBuffer();
        for(int i=0 ; i<arr.length ; i++){
            str.append(arr[i]+"");
            if(arr[i]==0){
                str.append("0");
            }
        }
        for(int i=0 ; i<arr.length ; i++){
            arr[i]= str.charAt(i)-'0';
        }
    }
    public static void main(String[] args) {
        duplicateZeros(new int[]{1,0,0,2,3,0,4,5,0});
    }
}