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
        System.out.println("달을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        scanner.close();
        System.out.println();
        System.out.printf("%d월은 %d일까지 있습니다.", month, getMonthDays(month));
        System.out.println();
        System.out.println();
        SampleCalendar();
    }
}
