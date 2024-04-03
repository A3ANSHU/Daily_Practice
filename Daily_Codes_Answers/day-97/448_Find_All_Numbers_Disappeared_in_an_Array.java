import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean arr [] = new boolean[nums.length+1];
        for(int i:nums){
            arr[i]=true;
        }
        for(int i=1 ; i<arr.length ; i++){
            if(!arr[i])list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }
}