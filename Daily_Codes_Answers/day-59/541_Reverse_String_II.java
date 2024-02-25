class Solution {
    static String reverseStr(String s, int k) {
        String finalstr = "";
        String str ="";
        boolean flag = false;
        for(int i=0 ; i<s.length(); i++){
            if(i%k==0){
                finalstr = finalstr+str;
                str="";
                if(flag)flag=false;
                else flag = true;
            }
            if (flag)str = s.charAt(i)+str;
            else str = str+s.charAt(i);
        }
        finalstr = finalstr+str;
        return finalstr;
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}