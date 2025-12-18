package Flowchart;

import java.util.Scanner;

public class MaxNumber {

    // 무한 입력값 중 종료 시 Max 입력값 받기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // 아주 작은 값으로 초기화

        while (true) {

            System.out.println("숫자를 입력하세요");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num > max) {
                max = num;
            }
        }
        System.out.println("입력값 중 최대값: " + max);
        sc.close();
    }

}
