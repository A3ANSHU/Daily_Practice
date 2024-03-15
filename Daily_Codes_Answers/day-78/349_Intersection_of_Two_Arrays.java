import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    static int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer>set = new HashSet<>();
        for (int num : nums1) {
            for (int num2 : nums2) {
                if (num == num2) {
                    set.add(num);
                    break;
                }
            }
        }
        int[] ret = new int[set.size()];
        int index = 0;
        for (int num : set) {
            ret[index++] = num;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1},new int[]{2,2})));
    }
}