package Flowchart.SignUp;

import java.util.Scanner;

public class JoinUp {

    private final UserInfo userInfo;

    public JoinUp(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void singUp(Scanner scanner) {
        String password;

        System.out.println(" ==회원가입== ");

        System.out.println("아이디를 입력해주세요: ");
        String id = scanner.next();

        while (true) {
            System.out.println("비밀번호를 입력해주세요: ");
            password = scanner.next();

            if (password.length() >= 8) {
                userInfo.register(id, password);
                System.out.println("회원가입이 완료 되었습니다");
                break;
            } else {
                System.out.println("비밀번호는 8자 이상이어야 합니다.");
                continue;
            }
        }
    }

    public void login(Scanner scanner) {
        System.out.println(" ==로그인== ");

        while (true) {
            if (userInfo.isLocked()) {
                System.out.println("계정이 잠겼습니다. 일정시간 후 다시 시도해주세요");
                return;
            }

            System.out.println("아이디 입력 : ");
            String inputId = scanner.nextLine();

            System.out.println("비밀번호 입력: ");
            String inputPassword = scanner.nextLine();

            boolean ok = userInfo.login(inputId, inputPassword);

            if (ok) {
                System.out.println("로그인 되었습니다.");
                return;
            }

            if (userInfo.isLocked()) {
                System.out.println("실패 5회 초과, 계정이 잠겼습니다.");
                return;

            } else {
                System.out.println("로그인에 실패하였습니다. 아디디/비밀번호를 다시 입력해주세요");
            }
        }
    }
}
