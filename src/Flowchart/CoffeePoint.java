package Flowchart;

import java.util.Scanner;

public class CoffeePoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalAmount = 0;
        int totalPoints = 0;

        while (true) {

            System.out.println(" 커피의 주문량을 입력해주세요 ");
            int total = sc.nextInt();

            if (total < 0) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                continue;

            } else if (total == 0) {
                System.out.println("총 결제금: " + totalAmount);
                System.out.println("총 적립 포인트: " + totalPoints);
                break;

            } else {
                int orderCount = total;

                int amount = orderCount * 4000;
                int points = (int) (amount * 0.05);

                totalAmount += amount;
                totalPoints += points;

                System.out.println ("이번 결제금: " + amount +" / 누적 결제금: " + totalAmount);
                System.out.println ("이번 적립 포인트: " + points + " / 누적 포인트: " + totalPoints);

                System.out.println();
            }
        }
    }
}