package Quest.Calculater;

import java.util.Scanner;

public class Main {

    // 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String exit = "";   // String 으로 exit 입력받을 것 셋팅

        while (!exit.equals("exit")) {    // exit 입력받으면 종료

            // 사용자 입력
            System.out.println("첫 번째 숫자를 입력하세요");
            int num1 = sc.nextInt();

            // 양의 정수 검증 실패 시 반복
            if (num1 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                continue;
            }

            System.out.println("두 번째 숫자를 입력하세요");
            int num2 = sc.nextInt();

            if (num2 < 0 ) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                continue;
            }

            System.out.println("연산자(+,-,*,/)를 입력하세요 ");
            char operator = sc.next().charAt(0);

            // 정수 나누기 정수는 소수점이 나올 수 있다.
            double result;

            // 사칙연산 분기 처리
            switch (operator) {
                case '+' -> result = num1 +num2;
                case '-' -> result = num1 -num2;
                case '*' -> result = num1 *num2;
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다");
                        continue;
                    }
                    result = (double) num1 / num2;   // 형변환!!
                }
                default -> {
                    System.out.println("지원하지 않는 연산자입니다");
                    continue;
                }
            }

            System.out.println("결과: " + result);
            System.out.println("종료를 원하면 'exit' 를 입력해주세요. 계속 원하시면 아무 글자를 입력해주세요");
            exit = sc.next();
        }
        sc.close();
        System.out.println("계산기를 종료합니다.");
    }


}
