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
