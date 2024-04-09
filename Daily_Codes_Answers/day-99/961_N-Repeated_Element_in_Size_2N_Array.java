import java.util.LinkedList;
import java.util.List;

class Solution {
    static int repeatedNTimes(int[] nums) {
        List <Integer> l = new LinkedList<>();
        for(int i: nums){
              if(l.contains(i))return i;
              else l.add(i);
        }
        return nums[0];
    }
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{2,1,2,5,3,2}));
    }
}