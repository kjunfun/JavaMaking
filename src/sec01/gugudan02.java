package sec01;

public class gugudan02 {
    public static void main(String[] args) {
        // 구구단 결과를 배열에 저장한 후 배열의 결과를 출력 한다.(2단에서 9단까지)
        for (int i = 2; i <= 9; i++) {
            print(calculate(i));
        }
    }
    // calculate 메서드: 구구단 계산 결과를 배열에 담는 로직 + print 메서드: 계산 결과를 화면에 출력하는 로직
    public static int[] calculate(int multi) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = multi * (i + 1);
        }
        return result;
    }

    public static void print(int[] result) {
        // 배열의 각 원소를 foreach를 사용하여 출력: foreach는 해당 형태의 for문을 지칭함.
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
