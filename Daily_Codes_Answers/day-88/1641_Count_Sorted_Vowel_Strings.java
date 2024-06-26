class Solution {
    static int countVowelStrings(int n) {
        // a e i o u
        int a=1;
        int e=1;
        int i=1;
        int o=1;
        int u=1;
        while(n>1){
            a=a+e+i+o+u;
            e=e+i+o+u;
            i=i+o+u;
            o=o+u;
            u=u;
            n--;
        }
        return a+e+i+o+u;
    }
    public static void main(String[] args) {
        System.out.println(countVowelStrings(2));
    }
}