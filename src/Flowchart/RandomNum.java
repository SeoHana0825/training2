package Flowchart;

import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {

        RandomNum random = new RandomNum();
        Scanner sc = new Scanner(System.in);

        int random1to100 = (int) (Math.random() * 100) + 1;
        int num;
        boolean correct = true;

        System.out.println("===1부터 100까지 숫자 맞추기 게임===");

        for (int i = 0; i < random1to100; i++) {
            System.out.println("숫자를 입력해주세요");
            num = sc.nextInt();

            if (num == -1) {
                System.out.println("시스템을 종료합니다");
                break;
            }

            if (num == random1to100) {
                System.out.println("정답!");
                correct = false;
                break;
            } else if (num < random1to100) {
                System.out.println("지금 숫자보다 UP!");
            } else if (num > random1to100) {
                System.out.println("지금 숫자보다 DOWN!");
            }
        }
        sc.close();

//        while (correct) {
//            System.out.println("숫자를 입력해주세요");
//            System.out.println();
//            num = sc.nextInt();
//
//            if (num == -1) {
//                System.out.println("시스템을 종료합니다");
//                break;
//            }
//
//            if (num == random1to100) {
//                System.out.println("정답!");
//                correct = false;
//            } else if (num < random1to100) {
//                System.out.println("지금 숫자보다 UP!");
//            } else if (num > random1to100) {
//                System.out.println("지금 숫자보다 DOWN!");
//            } else {
//                System.out.println("잘못입력 하셨습니다!");
//            }
//        }
//        sc.close();
    }
}
