class Solution {
    static String greatestLetter(String s) {
        char str = ' ';
        for(int i=0 ; i<s.length() ;i++){
            if(s.charAt(i)<=90 && s.contains((char)(s.charAt(i)+32)+"") && s.charAt(i)>str){
                str=s.charAt(i);
            }
        }
        return (str+"").trim();
    }
    public static void main(String[] args) {
        System.out.println(greatestLetter("arRAzFif"));
    }
}