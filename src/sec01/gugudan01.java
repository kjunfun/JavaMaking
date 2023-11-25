package sec01;

import java.util.Scanner;

public class gugudan01 {
    public static void main(String[] args) {
        // foreach는 배열과 연관, 배열의 특정 개수만 사용할 때 for / 전부 사용할 때 foreach
        // 따라서 다음과 같은 구구단의 구현은 중첩 for 반복문을 사용하면 된다.
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }

        // 사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
        System.out.println("구구단 중 출력할 단은? ");
        Scanner scanner = new Scanner(System.in); // 사용자가 입력받는 방법
        int num = scanner.nextInt();
        // 조건문에 따른 반복문, 데이터 타입에 대한 이해
        if (num >= 2 && num <= 9) { // 이런 구조일 경우 삼항 연산자를 쓰면 가독성이 더 안좋아 짐.
            // 삼항 연산자 ex) num = 2 ? "2이다" : "2아니다"
            for (int i = 1; i <= 9; i++) {
                System.out.println(num + " X " + i + " = " + (num * i));
            }
        } else {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        }

        // 구구단 결과를 배열에 저장한 후 배열의 결과를 출력 한다.(2단에서 9단까지)
        for (int i = 2; i <= 9; i++) {
            int[] result = new int[9]; // int[] intAry = {12, 34, 67} 동적 할당은 이럴 때.
            for (int j = 0; j < result.length; j++) {
                result[j] = i * (j + 1);
            }
            // 배열의 각 원소를 foreach를 사용하여 출력
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
