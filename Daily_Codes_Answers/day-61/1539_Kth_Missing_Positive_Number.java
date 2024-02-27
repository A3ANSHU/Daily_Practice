class Solution {
    static int findKthPositive(int[] arr, int k) {
        int i=0;
        int index=0;
        while(index<arr.length){
            i++;
            if(arr[index]==i){ 
                index++;
            }else{
                k--;
                if(k==0)return i;
            }
        } 
        return i+k;
    }
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11}, 5));
    }
}