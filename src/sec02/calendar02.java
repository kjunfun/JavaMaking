package sec02;

import java.net.Inet4Address;
import java.util.Scanner;

public class calendar02 {
    public static void main(String[] args) {
        System.out.println("두 수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitedValue = inputValue.split(" ");
        int v1 = Integer.parseInt(splitedValue[0]);
        int v2 = Integer.parseInt(splitedValue[1]);
        System.out.println("두 수의 합은 " + (v1 + v2) + "입니다.");
        scanner.close();
    }
}

//    <입력한 값을 문자열(String)로 받음>
//    Scanner scanner = new Scanner(System.in);
//    String inputValue = scanner.nextLine();
//    <입력한 값을 쉼표(,)를 기준으로 분리>
//    String[] splitedValue = inputValue.split(", ");
//    <쉼표를 기준으로 분리한 문자열을 숫자로 변환>
//    int first = Integer.parseInt(splitedValue[0]);
//    int second = Integer.parseInt(splitedValue[1]);


// <문자열 바로 입력하여 사용하기>
//        Scanner sc = new Scanner(System.in);
//        String [] strInputs = new String[5];
//        for (int i = 0; i < strInputs.length; i++) {
//            strInputs[i] = sc.nextLine();
//        }
//        sc.close();
//        for (String str : strInputs) {
//            System.out.println(str);
//        }

// <다른 풀이>
//        String s1, s2;
//        s1 = scanner.next();
//        s2 = scanner.next();
//        a = Integer.parseInt(s1);
//        b = Integer.parseInt(s2);
//        System.out.printf("두 수의 합은 %d입니다.", a + b);