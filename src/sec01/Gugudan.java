package sec01;

public class Gugudan {
    static void Calculate(int num1, int num2) { // 8, 7 -> 2 * 1 ~ 2 * 7 ~~ 8 * 7
        int row = num1; // 3
        int col = num2; // 2
        int[][] gugudanArr = new int[row][col];

        for (int i = 2; i <= row; i++) {
            for (int j = 0; j < col; j++) {
                gugudanArr[i-1][j] = i * (j + 1);
                System.out.print(i + " X " + (j + 1) + " = " + gugudanArr[i-1][j] + " ");
            }
            System.out.println();
        }
    }
}
