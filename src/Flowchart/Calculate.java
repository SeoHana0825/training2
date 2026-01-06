package Flowchart;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("첫 번째 숫자를 입력해주세요");
            int num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("정수를 입력해주세요");
            }

            System.out.println("두 번째 숫자를 입력해주세요");
            int num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("정수를 입력해주세요");
            }

            System.out.println("사칙연산 (+, -, *, /)을 입력해주세요");
            char op = sc.next().charAt(0);

            int result = 0;

            switch (op) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    } result = num1 / num2;
                }
                default -> {
                    System.out.println("지원하지 않는 연산자입니다");
                    continue;
                }

            }
            System.out.println("결과: " + result);
            break;
        }
        sc.close();
        System.out.println("계산기를 종료합니다.");
    }
}
