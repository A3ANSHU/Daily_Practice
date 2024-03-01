class Solution {
    static boolean strongPasswordCheckerII(String password) {
        if(password.length()<8)return false;
        String specialCharecters = "!@#$%^&*()-+";
        boolean lowercase = false;
        boolean uppercase = false;
        boolean digit = false;
        boolean special = false;

        if(password.charAt(0)>=97 && password.charAt(0)<=122)lowercase = true;
        if(password.charAt(0)>=65 && password.charAt(0)<=90)uppercase = true;
        if(password.charAt(0)>=48 && password.charAt(0)<=57)digit = true;
        if(specialCharecters.contains(""+password.charAt(0)))special = true;

        for (int i=1 ; i<password.length();i++){
            if(password.charAt(i)==password.charAt(i-1))return false;

            if(password.charAt(i)>=97 && password.charAt(i)<=122)lowercase = true;
            if(password.charAt(i)>=65 && password.charAt(i)<=90)uppercase = true;
            if(password.charAt(i)>=48 && password.charAt(i)<=57)digit = true;
            if(specialCharecters.contains(""+password.charAt(i)))special = true;

        }
        return lowercase && uppercase && digit && special;
    }
    public static void main (String [] args) {
        System.out.println(strongPasswordCheckerII("a1A!A!A!"));    }
}