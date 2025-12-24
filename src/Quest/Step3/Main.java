package Quest.Step3;

import Quest.Setp2.Calculator;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        String exit = "";

        while (!exit.equals("exit")) {

            System.out.println("첫 번째 숫자를 입력하세요");

            // double, integer 로 받으려고 String 으로 바꾸고 예외 처리
            String input1 = sc.next();
            Number num1 = input1.contains(".") ? Double.parseDouble(input1) : Integer.parseInt((input1));

//            if (num1 < 0) {
//                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
//                continue;
//            }

            System.out.println("두 번째 숫자를 입력하세요");

            String input2 = sc.next();
            Number num2 = (input2.contains(".") ? Double.parseDouble(input2) : Integer.parseInt(input2));

//            if (num2 < 0 ) {
//                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
//                continue;
//            }

            System.out.println("연산자(+,-,*,/)를 입력하세요 ");
            char operator = sc.next().charAt(0);

            // OperatorType 반환
            OperatorType operatorType= OperatorType.fromChar(operator);

            double result = arithmeticCalculator.calculate(num1, num2, operatorType);
//            Integer result = arithmeticCalculator.calculate (num1, num2, operator);
//
//            List<Integer> results = arithmeticCalculator.getResults();

            System.out.println("결과: " + result);

            System.out.println("저장된 결과: " + arithmeticCalculator.getResults());

            System.out.println("가장 먼저 저장된 결과를 지우시겠습니까? (yes)");
            String next = sc.next();
            if (next.equals("yes")) {
                arithmeticCalculator.removeResult();
                System.out.println("가장 먼저 저장된 결과 삭제 후: " + arithmeticCalculator.getResults());
            }

            System.out.println("특정 값보다 큰 결과를 조회하시겠습니까? (yes)");
            String quit = sc.next();
            if (quit.equals("yes")) {
                System.out.println("기준 값을 입력하세요: "); // 특정값 입력 필요
                double hold= sc.nextDouble();
                System.out.println("기존보다 큰 결과 : " + arithmeticCalculator.getResultsMax(hold));
            }

            System.out.println("종료를 원하면 'exit' 를 입력해주세요. 계속 원하시면 아무 글자를 입력해주세요");
            exit = sc.next();
        }
        System.out.println("계산기를 종료합니다.");
        sc.close();


        // 1 OperatorType enum 클래스 생성 -> arithmeticCalculator 수정 & 불러오기
        // 메인은 손대지 않음!! Operator -> arithmeticCalculator 로만 이름 변경

    }

}
