package Flowchart;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp;

        System.out.println("=== 온도 판별기 ===");

        System.out.println("온도를 입력해주세요");
        temp = sc.nextDouble();

        if (temp >= 0 && temp <= 100) {
            System.out.println("물 입니다");
        } else if (temp > 0) {
            System.out.println("수증기 입니다.");
        } else {
            System.out.println("얼음 입니다");
        }

    }

}