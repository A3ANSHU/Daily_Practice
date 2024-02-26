import java.util.*;

class Solution {
    static List<Integer> majorityElement(int[] nums) {
        Map <Integer,Integer>m = new HashMap<>();
        List <Integer>l = new ArrayList<>();
        for (int num : nums){
            if(m.containsKey(num)){
                m.put(num, m.get(num)+1);
            }else{
                m.put(num, 1);
            }
        }
        for (int key : m.keySet()){
            if(m.get(key)>nums.length/3){
                l.add(key);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }
}