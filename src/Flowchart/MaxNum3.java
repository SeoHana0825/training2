package Flowchart;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MaxNum3 {
    public static void main(String[] args) {

        System.out.println(" == 두 수를 입력해주세요 == ");

        Scanner sc = new Scanner(System.in);

        while (true) {

            try {
                System.out.println(" 첫 번째 숫자");
                int num1 = sc.nextInt();

                System.out.println(" 두 번째 숫자");
                int num2 = sc.nextInt();

                if (num1 == num2) {
                    System.out.println("두 수가 같습니다. 다시 입력해주세요");
                    continue;
                }
                int max = Math.max(num1, num2);
                System.out.println("최대 값: " + max);
                break;

            } catch (InputMismatchException e) {
                System.out.println(" 숫자가 아닙니다. 다시 입력해주세요");
                sc.next();
            }
            sc.close();
        }
    }
}

