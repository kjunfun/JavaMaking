package sec02;

import java.util.Scanner;

public class calendar04 {
    private static final int[] Months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        String PROMPT = "cal > ";
        Scanner scanner = new Scanner(System.in);
        while (true) { // 무한루프는 break로만 탈출 가능
            System.out.println("월을 입력하세요.");
            System.out.print(PROMPT);
            int month = scanner.nextInt();
            // TIL: static 필드, 메소드는 객체 생성없이 직접 호출 가능. but 일반적인 필드, 메소드는 객체를 생성해야 접근 가능함.
            // 가상의 달력 찍기: 월별 출력모양이 변화되는 달력을 만들어라!
            calendar03.SampleCalendar();
            if (month < 1) {
                System.out.println("Have a nice day!");
                break; // while문 종료
            }
            else if (month > 12) {
                continue; // 해당 단락 포함 while문에 묶여있는 아랫줄들 모두 건너뛰고 "월을 입력하세요." 부분으로 이동함
            }
            System.out.printf("%d월은 %d일까지 있습니다.\n",month, Months[month-1]);
        }
        scanner.close();
    }
}
