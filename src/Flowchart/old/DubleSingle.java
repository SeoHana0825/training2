package Flowchart;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DubleSingle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("숫자를 입력해주세요");
            int num = sc.nextInt();

            try {

                if (num % 2 == 0) {
                    System.out.println("짝수입니다");
                    break;

                } else {
                    System.out.println("홀수입니다");
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println(" 숫자가 아닙니다. 다시 입력해주세요");
                sc.next();
            } break;
        }
    }
}