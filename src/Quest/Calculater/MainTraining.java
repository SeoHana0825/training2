package Quest.Calculater;

import java.util.Scanner;

public class MainTraining {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String exit = ""; // exit 으로 종료 미리 설정

        while (!exit.equals("exit")) {    //exit 이 아닐때!!! 예외처리

            System.out.print ("첫 번째 숫자를 입력하세요");
            int num1 =sc.nextInt();
               if (num1 < 0) {
                   System.out.println ("0을 포함한 양의 정수만 입력 가능합니다.");
                   continue;
               }

            System.out.print("두 번재 숫자를 입력하세요");
            int num2 = sc.nextInt();
               if (num2 < 0 ) {
                   System.out.println ("0을 포함한 양의 정수만 입력 가능합니다.");
                   continue;
               }

            System.out.print ("연산자를 입력하세요");
            char operator = sc.next().charAt(0);

            double result;

            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if(num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    }
                    result = num1 / num2;
                }
                default -> {
                    System.out.println("지원하지 않는 연산자입니다.");
                    continue;
                }
            }

            System.out.println("결과: " + result);
            System.out.println("종료를 원하면 exit /  계속하려면 다른 문자를 입력해주세요");
            exit = sc.next();
        }
        sc.close();
        System.out.println("계산기를 종료합니다.");
    }
}
