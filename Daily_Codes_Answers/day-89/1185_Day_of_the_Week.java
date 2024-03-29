import java.util.HashMap;

class Solution {
    static String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Thursday", "Friday" ,"Saturday","Sunday", "Monday", "Tuesday", "Wednesday"};
        int count = 0;
        for (int i = 1971; i < year; i++) {
            if (i % 4 == 0 && ((i % 100 != 0) || (i % 400 == 0))) {
                count += 366;
            } else {
                count += 365;
            }
        }
        int total = 0;
        for(int i=1;i<month;i++){
            if (i == 2){
                if (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0)))
                    total+=29;
                else
                    total+=28;
            }
            else if (i == 4 || i == 6 || i == 9 || i == 11)
                total+=30;
            else
                total+=31;
        }

        int totalTillTheDate = count+total+day;
        int rem = (totalTillTheDate) % 7;         
        return week[rem];
    }
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(29, 3, 2024));
        System.out.println(dayOfTheWeek(15, 8, 1993));

    }
}