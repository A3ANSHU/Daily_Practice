import java.util.*;

class Solution {
    static boolean canBeEqual(int[] target, int[] arr) {
        List <String> l = new LinkedList<>();
        for(int i : arr){
            l.add(i+"");
        }
        for(int i:target){
            l.remove(i+"");
        }
        return l.isEmpty();
    }
    public static void main(String[] args) {
        canBeEqual(new int[]{1,2,3,4}, new int[]{2,4,1,3});
    }
}