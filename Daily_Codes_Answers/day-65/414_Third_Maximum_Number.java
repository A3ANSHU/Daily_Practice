import java.util.HashSet;
import java.util.Set;

class Solution {
    static int max3(int[] nums){
        Set <Integer> s = new HashSet<>();
        for (int i : nums){s.add(i);}
        System.out.println(s);
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int i : s){
            if(i>max){
                max3=max2;
                max2=max;
                max=i;
            }else if(i>max2){
                max3=max2;
                max2=i;
            }else if(i>max3){
                max3=i;
            }
        }
        if(s.size()<3)return max;
        return max3;
    }

    static int max32(int[] nums){
        long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        
        for (int num : nums) {
            if (max == num || max2 == num || max3 == num) {
                continue;
            }
            
            if (max <= num) {
                max3 = max2;
                max2 = max;
                max = num;
            }
            else if (max2 <= num) {
                max3 = max2;
                max2 = num;
            }
            else if (max3 <= num) {
                max3 = num;
            }
        }

        if (max3 == Long.MIN_VALUE) {
            int ans = (int) max;
            return ans;
        }
        
        int ans = (int) max3;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(max3(new int[]{2,2,3,1}));
    }
}
