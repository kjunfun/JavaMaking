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

    void Cal(int year, int month) {
        System.out.printf("    <<%d년 %d월>>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("----------------------");

        int maxDay = GetMonthDays(year, month);

        for (int i = 1; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
