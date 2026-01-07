package Flowchart.SignUp;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserInfo userInfo = new UserInfo();
        JoinUp join = new JoinUp(userInfo);

        while (true) {
            System.out.println(" 1) 회원가입 | 2) 로그인 | 0) 종료");
            System.out.println("선택: ");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                join.singUp(sc);
            } else if (choice.equals("2")) {
                join.login(sc);
            } else if (choice.equals("0")) {
                System.out.println("회원가입 및 로그인 절차를 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
                return;
            }
            break;
        }
        sc.close();

    }

}
