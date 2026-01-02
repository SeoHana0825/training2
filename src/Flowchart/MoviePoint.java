package Flowchart;

import java.util.Scanner;

public class MoviePoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalAmount = 0;
        int totalPoints = 0;

        while (true) {

            System.out.println("관람하신 영화 금액을 입력해주세요");
            int total = sc.nextInt();

            if (total < -1) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                continue;

            } else if (total == -1) {
                System.out.println("시스템을 종료합니다");
                System.out.println("결제 금액 : " + totalAmount + " / " + "적립 포인트 : " + totalPoints);
                break;

            } else {
                int movieCount = total;

                int amount = movieCount;
                int points = (int) (amount * 0.07);

                totalAmount += amount;
                totalPoints += points;

                System.out.println("누적 결제금: " + totalAmount + " / " + "현재 금액 : " + amount);
                System.out.println("누적 포인트: " + totalPoints + " / " + "현재 포인트 : " + points);
                continue;
            }

        }
        sc.close();
    }
}
