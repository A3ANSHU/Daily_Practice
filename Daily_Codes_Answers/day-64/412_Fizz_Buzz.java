import java.util.*;

class Solution {
    static List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        for(int i=1 ; i<=n ; i++){
            if(i%5==0 && i%3==0)l.add("FizzBuzz");
            else if(i%3==0)l.add("Fizz");
            else if(i%5==0)l.add("Buzz");
            else l.add(i+"");
        }
        return l;
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }
}