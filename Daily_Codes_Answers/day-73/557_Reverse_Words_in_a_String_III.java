class Solution {
    static String reverseWords(String s) {
        String arr[] = s.split(" ");
        for(int i=0 ; i<arr.length ;i++){
            String temp = "";
            for(int j=0 ; j<arr[i].length(); j++){
                temp = arr[i].charAt(j) + temp;
            }
            arr[i]= temp;
        }

        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str).append(" ");
        }
        return new String(sb).trim(); 
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}