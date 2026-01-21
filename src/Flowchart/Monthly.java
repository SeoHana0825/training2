package Flowchart;

import java.util.Scanner;

public class Monthly {

    public static void main(String[] args) {

        System.out.println(" == 계절 판별기 ==");
        Scanner sc = new Scanner(System.in);

        System.out.println("계절 판별을 원하는 '월'을 입력해주세요");
        int month = sc.nextInt();

        if (month < 0 || month > 12) {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
        }

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄 입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("여름 입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("가을 입니다.");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울 입니다.");
                break;
        }
    }
}
