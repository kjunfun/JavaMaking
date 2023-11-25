package sec01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("구구단을 출력할 두개의 숫자를 입력하세요: ");
        // 입력한 값을 문자열(String)로 받음.
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        // 입력한 값을 쉼표(,)를 기준으로 분리.
        String[] splitedValue = inputValue.split(", ");
        // 쉼표를 기준으로 분리한 문자열을 숫자로 변환.
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);
        Gugudan.Calculate(first, second);
    }
}
