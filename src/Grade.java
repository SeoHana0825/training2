import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        // 시험 점수 입력 받기
        Scanner sc = new Scanner(System.in);

        // 변수 정의
        int grade;

        System.out.println("=== 점수 판별을 시작합니다 === ");

        while (true) {

            System.out.println("시험 점수를 입력해주세요");
            grade = sc.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                continue;
            }
            if (grade >= 60) {
                System.out.println("합격입니다.");
                break;
            } else {
                System.out.println("불합격입니다.");
                break;
            }
        } sc.close();
    }
}
