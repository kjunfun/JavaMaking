package sec02.RealCalendar;
/* <TIL>
*/
public class MyCalendar {
    // 윤년(=그레고리력에서 사용되는 양력의 개념중 하나로, 태양년의 길이를 정확하게 반영하기 위한 조정. why? 태양년의 지구 공전 시간은 365.2422정도 이므로, 1년 365일 달력으로는 태양년 길이를 정확히 반영할 수 없으므로 4년에 1일씩 추가하는 것임)일 경우 2월이 하루 더 늘어난 29일이 된다.
    final int[] MonthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final int[] LeapMonthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    // 윤년 규칙
    boolean isLeapDay(int year) { // 윤년이면 true를 반환하는 메소드
        return (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0));
    }

    // 구현된 메소드 사용하여 년도, 월 입력하면 정교한 달력을 출력
    void Cal(int year, int month) {
        System.out.printf("   <%d년 %d월 달력>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("----------------------");
        // 자동으로 첫번째 요일 가져오기
        int weekDay = getWeekDay(year, month);
        for (int i = 0; i < weekDay; i++) {
            System.out.print("   ");
        }
        int monthDay = GetMonthDays(year, month);
        int count = 7 - weekDay; // WE 입력한 경우 7 - IDX(=3) = 4
        //달력의 첫번째 line까지
        for (int i = 1; i <= count; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        //달력의 첫번째 line이후
        int cnt = 0;
        for (int i = count + 1; i <= monthDay; i++) {
            cnt += 1;
            System.out.printf("%3d", i);
            if (cnt % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    // 메소드 구현 부분
    int GetMonthDays(int year, int month) {
        if (isLeapDay(year)){
            return LeapMonthDays[month-1];
        }
        else {
            return MonthDays[month - 1];
        }
    }

    int getWeekDay(int year, int month) {
        final int standard_year = 1970; // 1970년 1월 1일 목요일(일요일:0,,, 목요일:4)
        final int standard_weekday = 4;
        int day_count = 0;
        for (int i = standard_year; i < year; i++) {
            int for_sum = isLeapDay(i) ? 366 : 365;
            day_count += for_sum;
        }
        for (int i = 1; i < month; i++) {
            int for_sum = GetMonthDays(year, i);
            day_count += for_sum;
        }
        int weekday;
        weekday = (day_count + standard_weekday) % 7;
        return weekday;
    }

    // simple test code
    public static void main(String[] args) {
        MyCalendar c = new MyCalendar();
        System.out.println(c.getWeekDay(1970, 1));
        System.out.println(c.getWeekDay(1971, 1));
        System.out.println(c.getWeekDay(1972, 1));
        System.out.println(c.getWeekDay(1973, 1));
        System.out.println(c.getWeekDay(1974, 1));
    }
}