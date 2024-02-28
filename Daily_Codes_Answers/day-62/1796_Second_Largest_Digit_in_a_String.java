import java.util.*;

class Solution {
    static int secondHighest(String s) {       
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        char max= arr[0];
        char max2= 'a';
        for(char ch:arr){
            if(ch>max && ch<='9'){
                max2=max;
                max=ch;
            }
        }
        return max2!='a'?max2-'0':-1;
    }
    public static void main(String[] args) {
        System.out.println(secondHighest("dfa12321afd"));
    }
}