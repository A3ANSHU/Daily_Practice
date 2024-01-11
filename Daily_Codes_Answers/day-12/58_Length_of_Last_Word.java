class Anshu{
    static int lengthOfLastWord(String s) {
        String [] temp = s.split(" ");
        return temp[temp.length-1].length();
    }
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon   ";
        String s3 = "luffy is still joyboy";

        System.out.println("-- test case 1 --");
        System.out.println("input : "+s1+"\nOutput : "+lengthOfLastWord(s1));
        System.out.println("-- test case 2 --");
        System.out.println("input : "+s2+"\nOutput : "+lengthOfLastWord(s2));
        System.out.println("-- test case 3 --");
        System.out.println("input : "+s3+"\nOutput : "+lengthOfLastWord(s3));
    }
}