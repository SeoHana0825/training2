package Flowchart;

import java.util.Scanner;

public class Year {

    public static void main(String[] args) {

        System.out.println(" 윤년과 평년을 확인할 연도를 입력해주세요 ");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int year = sc.nextInt();

            if (year == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(" 윤년 ");
                break;
            } else {
                System.out.println(" 평년 ");
                break;
            }
        } sc.close();
    }
}
