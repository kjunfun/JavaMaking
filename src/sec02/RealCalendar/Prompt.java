package sec02.RealCalendar;

import java.util.Scanner;

// Prompt 입출력 작업 및 Calendar 호출하여 사용
public class Prompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalendar mycal = new MyCalendar();

        while (true) {
            System.out.println("년도를 입력 하세요");
            System.out.print("Year > ");
            int year = scanner.nextInt();
            System.out.println("월을 입력 하세요.");
            System.out.print("Month > ");
            int month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Have a nice day~");
                break;
            }
            System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
            System.out.print("WEEKDAY > ");
            String weekday = scanner.next(); // 문자열 입력시 next 방식이 엔터키 소비 작업 처리
            System.out.println();
            mycal.Cal(year, month, weekday);
        }
        // 스캐너 닫기
        scanner.close();
    }
}
