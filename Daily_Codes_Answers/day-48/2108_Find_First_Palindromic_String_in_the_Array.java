class Anshu {
    static String firstPalindrome(String[] words) {
        for (int i =0; i<words.length ; i++){
            int s=0;
            int e=words[i].length()-1;
            boolean flag = true;
            while(s<e){
                if(words[i].charAt(s) != words[i].charAt(e)){
                    flag = false;
                }
                s++;
                e--;
            }
            if(flag){
                return words[i];
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String words1[] = new String[]{"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words1));
    }
}