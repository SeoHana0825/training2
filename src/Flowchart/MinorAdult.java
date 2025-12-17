package Flowchart;

import java.util.Scanner;

public class MinorAdult {

    public static void main(String[] args) {

        // 사용자 나이 입력 받기
        Scanner sc = new Scanner(System.in);

        // 객체값 설정
        int age;

        // 반목문 선언
        while (true) {

            System.out.println("나이를 입력해주세요");
            age = sc.nextInt();

            if (age < 0) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                continue;
            }

            // 나이가 19보다 미만일 경우 "미성년자" 출력, 이상일 경우 "성인" 출력 후 종료
            if (age < 19) {
                System.out.println("미성년자 입니다");
                break;
            } else if (age >= 19) {
                System.out.println("성인입니다.");
                break;
            }
        }
        sc.close();
    }
}
