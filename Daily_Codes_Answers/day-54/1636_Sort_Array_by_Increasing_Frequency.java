import java.util.*;

class Solution {
    static int[] frequencySort(int[] nums) {

        Map <Integer,Integer> m = new HashMap<>();
        for(int i : nums){
            if(m.containsKey(i)){ m.put(i, m.get(i)+1);}
            else m.put(i, 1);
        }

        Map <Integer,ArrayList<Integer>> mr = new TreeMap<>();

        for(int i : m.keySet()){   
            ArrayList<Integer> l = new ArrayList<>();

            if(mr.containsKey(m.get(i))){
                mr.get(m.get(i)).add(i);
            }
            else{l.add(i);
            mr.put(m.get(i), l);}
        }

        int index=0;
        for(int i : mr.keySet()){
            int num=i*mr.get(i).size(); 
            int j=mr.get(i).size()-1;
            Collections.sort(mr.get(i));
            while(num>0){
                nums[index]= mr.get(i).get(j);
                num--;
                index++;
                if(num%i==0){j--;}
            }
        }   
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int []{2,3,1,3,2})));
        System.out.println(Arrays.toString(frequencySort(new int []{-1,1,-6,4,5,-6,1,4,1})));
        System.out.println(Arrays.toString(frequencySort(new int []{-53,-53,52,52,52,52,-53,-53,52,-53,52,52,52,-53,52,52,-53,52,-53,52,-53,52,52,52,52,52,52,52,52,52,-53,52,-53,52,-53,52,52,52,-53,-53,52,-53,52,52,52,52,-53,-53,-53,-53,-53,52,52,-53,52,-53,52,52,52})));
    }
}