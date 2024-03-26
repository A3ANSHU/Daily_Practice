import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    static String sortVowels0(String s) {
        List <Character>l = new ArrayList<>();
        for(int i=0 ; i<s.length() ; i++){
            if(
                (s.charAt(i)+"").toUpperCase().equals("A") ||
                (s.charAt(i)+"").toUpperCase().equals("E") ||
                (s.charAt(i)+"").toUpperCase().equals("I") ||
                (s.charAt(i)+"").toUpperCase().equals("O") ||
                (s.charAt(i)+"").toUpperCase().equals("U")
            ){
                l.add(s.charAt(i));
            }
        }
        if(l.size()==0)return s;
        Collections.sort(l);
        StringBuffer str = new StringBuffer();
        int j=0;
        for(int i=0 ; i<s.length() ; i++){
            if(
                (s.charAt(i)+"").toUpperCase().equals("A") ||
                (s.charAt(i)+"").toUpperCase().equals("E") ||
                (s.charAt(i)+"").toUpperCase().equals("I") ||
                (s.charAt(i)+"").toUpperCase().equals("O") ||
                (s.charAt(i)+"").toUpperCase().equals("U")
            ){
                str.append(l.get(j));
                j++;
            }else{
                str.append(s.charAt(i));
            }
        }
        return new String(str);
    }
    static String sortVowels(String s) {
        List <Character>l = new ArrayList<>();
        for(int i=0 ; i<s.length() ; i++){
            if(
                (s.charAt(i)=='A') ||
                (s.charAt(i)=='E') ||
                (s.charAt(i)=='I') ||
                (s.charAt(i)=='O') ||
                (s.charAt(i)=='U') ||
                (s.charAt(i)=='a') ||
                (s.charAt(i)=='e') ||
                (s.charAt(i)=='i') ||
                (s.charAt(i)=='o') ||
                (s.charAt(i)=='u')
            ){
                l.add(s.charAt(i));
            }
        }
        if(l.size()==0)return s;
        Collections.sort(l);
        StringBuffer str = new StringBuffer();
        int j=0;
        for(int i=0 ; i<s.length() ; i++){
            if(
                (s.charAt(i)=='A') ||
                (s.charAt(i)=='E') ||
                (s.charAt(i)=='I') ||
                (s.charAt(i)=='O') ||
                (s.charAt(i)=='U') ||
                (s.charAt(i)=='a') ||
                (s.charAt(i)=='e') ||
                (s.charAt(i)=='i') ||
                (s.charAt(i)=='o') ||
                (s.charAt(i)=='u')
            ){
                str.append(l.get(j));
                j++;
            }else{
                str.append(s.charAt(i));
            }
        }
        return new String(str);
    }
    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }
}