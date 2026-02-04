package Flowchart;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        System.out.println("==가위바위보 게임==");
        Scanner sc = new Scanner(System.in);

        // 랜덤 판별 객체 생성
        Random random = new Random();

        while (true) {
            System.out.println("가위바위보 게임 시작합니다. 가위 (1), 바위(2), 보(3)을 입력해주세요");
            int rcpGame = sc.nextInt();
            int computer = random.nextInt(3) +1;

            // 1, 2, 3 사이에 숫자만 입력할 수 있게 범위 설정
            if (rcpGame < 1 || rcpGame > 3) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                // 입력으로 다시 돌아가기
                continue;

            } else if (rcpGame == computer) {
                System.out.println("결과: 비겼습니다");
            } else if ((rcpGame == 1 && computer == 3) ||
                       (rcpGame == 2 && computer == 1) ||
                       (rcpGame == 3 && computer == 2)
            ) {
                System.out.println("결과 : 사용자가 이겼습니다.");

            } else {
                System.out.println("결과 : 컴퓨터가 이겼습니다.");
            }

            System.out.println("다시 시작하시겠습니까? (Y / N)");

            if ("N".equalsIgnoreCase(sc.next())) {
                System.out.println("가위바위보를 종료하겠습니다.");
                break;
            }

        }
        sc.close();
    }
}
