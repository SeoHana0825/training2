package Flowchart;

import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==엘레베이터 프로그램 시작==");

        System.out.println("현재 층을 입력해주세요");
        int floor = sc.nextInt();
        if (floor == 0) {
            System.out.println("현재 정비중입니다. 조금만 기다려 주세요");
            return;
        }

        System.out.println("도착 층을 입력해주세요");
        int arrival = sc.nextInt();

        while (true) {

            int result = 0;
            int result2 = 0;

            if (floor == arrival) {
                System.out.println("이미 같은 층입니다.");
                break;
            } else if (floor < arrival) {
                result = floor += arrival;
                System.out.println(arrival + "층으로 " + result + "층 올라갑니다");
                break;
            } else if (floor > arrival) {
                result2 = floor -= arrival;
                System.out.println(arrival + "층으로 " + result2 + "층 내려갑니다");
                break;
            }
        }
        sc.close();
    }
}
