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
            System.out.println();
            mycal.Cal(year, month);
        }
        // 스캐너 닫기
        scanner.close();
    }
}