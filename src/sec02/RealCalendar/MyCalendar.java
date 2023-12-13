package sec02.RealCalendar;

public class MyCalendar {
    // 연월 셋팅
    final int[] MonthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final int[] LeapMonthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    boolean isLeapDay(int year) { // 윤년이면 true를 반환하는 메소드
        return (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0));
    }

    // 윤년 처리
    int GetMonthDays(int year, int month) {
        int maxDay;
        if (isLeapDay(year)){
            return LeapMonthDays[month-1];
        }
        else {
            return MonthDays[month - 1];
        }
    }

    // 시작 요일 인덱스 처리
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

    // 연도, 월, 시작 요일을 기반으로 달력을 출력
    void Cal(int year, int month, String weekday) {
        System.out.printf("    <<%d년 %d월>>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("----------------------");
        int weekDayIdx = GetWeekDayIdx(weekday);
        for (int i = 0; i < weekDayIdx; i++) {
            System.out.print("   ");
        }

        int maxDay = GetMonthDays(year, month);
        int count = 7 - weekDayIdx; // WE 입력한 경우 7 - IDX(=3) = 4

        //FIRST LINE PRINT
        for (int i = 1; i <= count; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        int cnt = 0;
        //SECOND TO LAST PRINT
        for (int i = count + 1; i <= maxDay; i++) {
            cnt += 1;
            System.out.printf("%3d", i);

            if (cnt % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }
}