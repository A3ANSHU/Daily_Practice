class Anshu{
    static String addStrings(String num1, String num2){
        int i = num1.length()-1;
        int j = num2.length()-1;
        String output = "";

        int rem =0 ; 
        while(i>=0 || j>=0){
            int n1 = 0;
            int n2 = 0;
            if(i>=0){
                n1 = Integer.parseInt(""+num1.charAt(i));
                i--;
            }
            if(j>=0){
                n2 = Integer.parseInt(""+num2.charAt(j));
                j--;
            }
            int num = n1+n2+rem;
            
            if(num>9){
                rem = 1;
            }else{
                rem = 0;
            }
            
            output = (num%10+output);
            
        }

        return output;
    }
    public static void main(String[] args) {
        
        String num1 = "11";
        String num2 = "123";
        System.out.println("-- test case 1 --");
        System.out.println("Input : num1 : "+num1+" num2 : "+num2+"\nOutput :"+ addStrings(num1, num2));

        String num3 = "456";
        String num4 = "77";
        System.out.println("-- test case 2 --");
        System.out.println("Input : num1 : "+num3+" num2 : "+num4+"\nOutput :"+ addStrings(num3, num4));

        String num5 = "0";
        String num6 = "0";
        System.out.println("-- test case 3 --");
        System.out.println("Input : num1 : "+num5+" num2 : "+num6+"\nOutput :"+ addStrings(num5, num6));

    }
}