class Solution {
    static void duplicateZeros(int[] arr) {
        int n1=arr[0];
        int n2=arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==0 && i!=arr.length-1){
                n1=n2;
                n2=arr[i];
            }else{
                arr[i]=n1;
            }
        }
    }
    public static void main(String[] args) {
        duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
}