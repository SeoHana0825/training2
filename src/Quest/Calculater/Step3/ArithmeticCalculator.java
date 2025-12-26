package Quest.Step3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator {

    // step2 에서 만든 Calculator 코드 여기로
    // 8 Integer -> Double 변경
    private final List<Double> results = new ArrayList<>();

    // 9 반환타입 변경 (제네릭으로 선언) -> 상속 extends 어떤 숫자가와도 다 받을 수있음
    // T, U : Number 의 한 종류 (int or double)
    public <T extends Number, U extends Number> double calculate(T num1, U num2, OperatorType operator) {

        double double1 = num1.doubleValue();
        double double2 = num2.doubleValue();

        // 12 operator apply 부르면 double 타입의 결과를 바로 실행 가능
        double result = operator.apply(double1, double2);

        //int result;
        // 7 여기에서 OperatorType enum 클래스 데려오기!! static 이라 new 하지 않아도 x
        // OperatorType operatorType = OperatorType.fromChar(operator); -> 위에서 따로 불러서 없어져도 됨

        // 8  switch 문에서 비교할 수 있게 변경
        // 9 enum 사용하기 위해 없앰
//        switch (operatorType) {
//            case ADD -> result = num1 + num2;
//            case SUB -> result = num1 - num2;
//            case MUL -> result = num1 * num2;
//            case DIV -> {
//                if (num2 == 0) {
//                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
//                }
//                result = num1 / num2;
//            }
//            default ->
//                    throw new IllegalArgumentException("지원하지 않는 문자입니다.");
//        }

        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return results;
    }

    public void removeResult() {
        results.remove(0); // 인덱스는 [0][1][2][3] / 실제 보이는건 [1][2][3][4]
    }

    // 마지막 특정값보다 큰 결과 조회 (람다, 스트림 : 뜯어서 펼친다)
    public List<Double> getResultsMax(double hold) {
        return results.stream()
                .filter(v -> v > hold)
                .collect(Collectors.toList());
    }
}
