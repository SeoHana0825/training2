package Flowchart;

import java.util.Scanner;

public class Grade2 {

    public static void main(String[] args) {

        System.out.println("== 학점 판별기 ==");

        Scanner sc = new Scanner(System.in);
        String exit = "";

        while (true) {
            System.out.println("학점을 입력해주세요");
            String grade = sc.next();

            if (grade.equalsIgnoreCase("A")) {
                System.out.println("90~100 점 입니다.");
                break;
            } else if (grade.equalsIgnoreCase("B")) {
                System.out.println("80~89 점 입니다.");
                break;
            } else if (grade.equalsIgnoreCase("C")) {
                System.out.println("70~79 점 입니다.");
                break;
            } else if (grade.equalsIgnoreCase("D")) {
                System.out.println("60~69 점 입니다.");
                break;
            } else if (grade.equalsIgnoreCase("F")) {
                System.out.println("0~59 점 입니다.");
                break;
            }

            if (!exit.equals("exit")) {
                System.out.println("입력값이 맞지 않습니다.다시 입력하시겠습니까? 종료를 희망할 시, exit 을 입력해주세요 ");
                exit = sc.next();
                continue;
            }
            System.out.println("학점 판별기를 종료합니다.");
            break;
        }
        sc.close();
    }
}
