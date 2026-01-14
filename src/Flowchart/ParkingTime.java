package Flowchart;

import java.util.Scanner;

public class ParkingTime {

    public static void main(String[] args) {

        System.out.println("주차요금 정산을 시작합니다.");

        Scanner sc = new Scanner(System.in);
        int parkingTime = sc.nextInt();

        while (true) {
            if (parkingTime == 0) {
                System.out.println("시스템을 종료합니다");
                break;
            }

            int hour = (parkingTime + 59) / 60;
            int parkingFee = 0;

            if (parkingTime <= 60) {
                parkingFee = 1000;
            } else if (parkingTime <= 180) {
                parkingFee = hour * 2000;
            } else if (parkingTime > 180) {

                parkingFee = hour * 5000;
            }
            System.out.println("총 주차 시간 : " + parkingTime + "분");
            System.out.println("합계 : " + parkingFee + "원 입니다.");
            break;

        }
        sc.close();
    }
}