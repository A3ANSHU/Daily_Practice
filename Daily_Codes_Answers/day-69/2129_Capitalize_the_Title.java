class Solution {
    static String capitalizeTitle(String title) {
        StringBuffer output = new StringBuffer();
        for(String str : title.split(" ")){
            if(str.length()<=2){
                output.append(str.toLowerCase()+" ");
            }else{
                output.append(str.substring(0, 1).toUpperCase()+str.substring(1, str.length()).toLowerCase()+" ");
            }
        }
        return new String(output).trim();
    }
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
    }
}