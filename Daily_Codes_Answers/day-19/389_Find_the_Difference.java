import java.util.Arrays;

class Anshu {
    static char findTheDifference(String s, String t) {
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i=0 ; i<s1.length ; i++){
            if(s1[i]!=t1[i]){
                return t1[i];
            }
        }
        return t1[t1.length-1];
    }
    public static void main(String[] args) {

        String s1 = "abcd";
        String t1 = "abcde";
        String s2 = "";
        String t2 = "y";

        System.out.println("-- test case 1 --");
        System.out.println("Input : s - "+s1+" t - "+t1+"\nOutput : "+findTheDifference(s1,t1));
        System.out.println("-- test case 2 --");
        System.out.println("Input : s - "+s2+" t - "+t2+"\nOutput : "+findTheDifference(s2,t2));
    }
}