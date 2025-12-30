package Flowchart;

import java.util.Scanner;

public class Weekly {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int day = 0;

        while (true) {
            System.out.println("요일을 확인할 숫자를 입력해주세요");
            day = sc.nextInt();

            if ( day < 0 || day > 7) {
                System.out.println("다시 입력해주세요");
                continue;
            } else if (day >= 1 && day <= 5) {
                System.out.println("평일 입니다");
                break;
            } else {
                System.out.println("주말 입니다");
                break;
            }
        }
        sc.close();
    }
}
