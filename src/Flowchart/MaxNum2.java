package Flowchart;

import java.util.Scanner;

public class MaxNum2 {

    public static void main(String[] args) {

        System.out.println("== 두 숫자를 입력해주세요 ==");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);

        while(true) {

            if (num1 == num2) {
                System.out.println("두 수가 같습니다. 다시 입력해주세요");
                return;
            } else {
                System.out.println("두 수 중 최대값 : " + max);
                break;
            }
        }
        sc.close();
    }
}
