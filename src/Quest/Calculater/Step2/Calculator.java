package Quest.Calculator.Step2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 1 results 컬렉션 필드에 저장
    // List 는 원래 가장 먼저 저장된 숫자를 삭제하는 클래스
    private final List<Integer> results = new ArrayList<>();

    // 2 calculate 사용자 생성
    public Integer calculate(int num1, int num2, char operator) {

        int result;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    // 예외문 바로 들어가기 (0으로 나눌 때 java에서 기본적으로 주어지는 메서드)
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
            }
            default ->
                // 예외문 바로 들어가기 (다른 문자일 때 java에서 기본적으로 주어지는 메서드)
                    throw new IllegalArgumentException("지원하지 않는 문자입니다.");
        }
            results.add(result);
            return result;
        }
        // 5 getter 작성
        public List<Integer> getResults() {
            return results;
        }

        // 7 삭제
    public void removeResult() {
        results.remove(0); // 인덱스는 [0][1][2][3] / 실제 보이는건 [1][2][3][4]
    }

    public static class CalculatorTraining {
    }
}
