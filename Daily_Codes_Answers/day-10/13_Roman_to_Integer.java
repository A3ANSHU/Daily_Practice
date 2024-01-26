class Anshu{
    static int romanToInt(String s) {
        int I=1;
        int X=10;
        int C=100;

        int value=0;
        for(int i=s.length()-1 ; i>=0 ; i--){
            if(s.charAt(i)=='I'){
                value+=I;
                continue;
            }else{
                I=-1;
            }
            if(s.charAt(i)=='V'){
                value+=5;
                continue;
            }
            if(s.charAt(i)=='X'){
                value+=X;
                continue;
            }else{
                X=-10;
            }
            if(s.charAt(i)=='L'){
                value+=50;
                continue;
            }
            if(s.charAt(i)=='C'){
                value+=C;
                continue;
            }else{
                C=-100;
            }
            if(s.charAt(i)=='D'){
                value+=500;
                continue;
            }
            if(s.charAt(i)=='M'){
                value+=1000;
                continue;
            }
        
        }
        return value;
    }
    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";

        System.out.println("test case 1 ---> "+s1+" = "+romanToInt(s1));
        System.out.println("test case 2 ---> "+s2+" = "+romanToInt(s2));
        System.out.println("test case 3 ---> "+s3+" = "+romanToInt(s3));
    }
}