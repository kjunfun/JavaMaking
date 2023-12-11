package sec02.RealCalendar;

public class MyCalendar {
    final int[] MonthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final int[] LeapMonthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    boolean isLeapDay(int year) { // 윤년이면 true를 반환하는 메소드
        return (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0));
    }

    int GetMonthDays(int year, int month) {
        int maxDay;
        if (isLeapDay(year)){
            return LeapMonthDays[month-1];
        }
        else {
            return MonthDays[month - 1];
        }
    }

    int GetWeekDayIdx(String weekday) { //앞으로 첫글자는 소문자로 쓰자.
        if ("SU".equals(weekday)) { // 문자열 비교는 == 말고 자바에선 equals 메소드를 써야함.
            return 0;
        }
        else if ("MO".equals(weekday)) {
            return 1;
        }
        else if ("TU".equals(weekday)) {
            return 2;
        }
        else if ("WE".equals(weekday)) {
            return 3;
        }
        else if ("TH".equals(weekday)) {
            return 4;
        }
        else if ("FR".equals(weekday)) {
            return 5;
        }
        else if ("SA".equals(weekday)) {
            return 6;
        }
        else {
            return 0;
        }
    }

    void Cal(int year, int month, String weekday) {
        System.out.printf("    <<%d년 %d월>>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("----------------------");
        int weekDayIdx = GetWeekDayIdx(weekday);
        System.out.print("   ".repeat(weekDayIdx)); //Java 11 이상부터 사용가능, Java 11 이전의 경우 for문 돌려야 함.

        int maxDay = GetMonthDays(year, month);

        for (int i = 1; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }
}
