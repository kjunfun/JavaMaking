package sec02;

import java.util.Scanner;

public class calendar03 {
    // private: 해당 배열은 같은 클래스 내에서 접근 가능
    // static: 클래스의 인스턴스를 생성하지 않고 접근 가능
    // final: 해당 배열은 값을 변경할 수 없는 상수
    private static final int[] Months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getMonthDays(int month) {
        return  Months[month - 1];
    }

    public static void SampleCalendar() {
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        for (int i = 1; i <= 28 ; i++) {
            System.out.printf("%3d", i);
            if(i % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("반복횟수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        // for문은 while문과 달리 반복 횟수가 정해져 있을 때 사용한다.
        for (int i = 0; i < repeat; i++) {
            System.out.println("달을 입력하세요.");
            int month = scanner.nextInt();
            System.out.printf("%d월은 %d일까지 있습니다.", month, getMonthDays(month));
            System.out.println();
        }
        scanner.close();
        System.out.println();
        System.out.println("Good Bye~ 아래는 샘플 달력 입니다.");
        System.out.println();
        SampleCalendar();
    }
}
