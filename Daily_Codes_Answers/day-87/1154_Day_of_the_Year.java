class Solution {
    static int dayOfYear(String date) {
        String arr[] = date.split("-");
        int ret = 0;
        int month =0;
        ret = ((arr[2].charAt(0)-'0')*10)+(arr[2].charAt(1)-'0');
        month=((arr[1].charAt(0)-'0')*10)+(arr[1].charAt(1)-'0');

        if(month>1){
            if(month <= 3)ret+=1+((month-1)*30);
            else if(month <= 5)ret+=2+((month-1)*30);
            else if(month <= 7)ret+=3+((month-1)*30);
            else if(month <= 8)ret+=4+((month-1)*30);
            else if(month <= 10)ret+=5+((month-1)*30);
            else if(month <= 12)ret+=6+((month-1)*30);
        }
        
        if(month>2){
            int no = ( (arr[0].charAt(2)-'0') * 10)+(arr[0].charAt(3)-'0');
            if(no!=0){
                if(no%4==0)ret-=1;
                else ret-=2;
            }else{
                no = ( (arr[0].charAt(0)-'0') * 1000)+((arr[0].charAt(1)-'0') * 100)+no;
                if(no%400==0)ret-=1;
                else ret-=2;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        // System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("1900-09-14"));
    }
}