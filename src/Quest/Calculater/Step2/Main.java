package Quest.Calculator.Step2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // 3 Calculator 인스턴스화
            Calculator calculator = new Calculator();

            String exit = "";   // String 으로 exit 입력받을 것 셋팅

            while (!exit.equals("exit")) {    // exit 입력받으면 종료

                System.out.println("첫 번째 숫자를 입력하세요");
                int num1 = sc.nextInt();

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

                // 4 calculator 메서드에 있는 사용자 calculate 호출
                Integer result = calculator.calculate (num1, num2, operator);

                // public 일때
                //List<Integer> results = calculator.results;

                // 6 results 필드에 접근 가능
                List<Integer> results = calculator.getResults();

                System.out.println("결과: " + result);

                System.out.println("저장된 결과: " + calculator.getResults());

                // 8 삭제 메서드 remove 불러오기
                System.out.println("가장 먼저 저장된 결과를 지우시겠습니까? (yes)");
                String next = sc.next();
                if (next.equals("yes")) {
                    calculator.removeResult();
                    System.out.println("가장 먼저 저장된 결과 삭제 후: " + calculator.getResults());
                }

                System.out.println("종료를 원하면 'exit' 를 입력해주세요. 계속 원하시면 아무 글자를 입력해주세요");
                exit = sc.next();
            }
            System.out.println("계산기를 종료합니다.");
            sc.close();
        }

    }
