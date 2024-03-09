import java.util.*;

class Solution {
    static int[] relativeSortArray(int[] arr1, int[] arr2) {   
        List <Integer> l = new ArrayList<>();
        for(int i : arr1){
            l.add(i);
        }
        int j=0;
        int i=0;
        while(j<arr2.length){
            arr1[i]=arr2[j];
            l.remove(l.indexOf(arr2[j]));
            if(l.indexOf(arr2[j])==-1){
                j++;
            }
            i++;
        }
        Collections.sort(l);
        for(int val : l){
            arr1[i]=val;
            i++;
        }
        return arr1;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6})));
    }
}