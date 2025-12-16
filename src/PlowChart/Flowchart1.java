package PlowChart;

import java.util.Scanner;

public class Flowchart1 {

    public static void main(String[] args) {

        // 문제 1. 미성년자 / 성인 판별기

        // 사용자 나이 입력 받기
        Scanner sc = new Scanner(System.in);

        int age;

        while (true) {
            System.out.println("나이를 입력해주세요");
            age = sc.nextInt();

            //  음수 입력 시, 예외상황 처리
            if (age < 0) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                continue;
            }


            if (age < 19) {
                System.out.println("미성년자 입니다.");
                break;
                // age (나이) 19 미만인 경우, "미성년자" 입력 후 종료

            }else if (age >= 19) {
                System.out.println("성인입니다.");
                break;
                // age (나이) 19 이상인 경우, "성인" 입력 후 종료
            }
        } sc.close();
    }
}
