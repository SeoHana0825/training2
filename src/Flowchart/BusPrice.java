package Flowchart;

import java.util.Scanner;

public class BusPrice {

    public static void main(String[] args) {

        System.out.println(" == 버스 요금 확인 == ");

        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        while (true) {
            if (price >= 0 && price <= 3000) {
                System.out.println("요금 확인 완료");
                break;
            } else {
                System.out.println("잘못된 요금입니다");
                continue;
            }
        } sc.close();
    }

}
