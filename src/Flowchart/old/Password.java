package Flowchart;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password;
        int failCount = 0;

        System.out.println(" === 로그인 === ");

        while (true) {

            System.out.println("비밀번호를 입력해주세요");
            password = sc.nextLine();

            // 비밀번호 길이 제한
            if (password.length() <= 8) {
                System.out.println("입력이 8자를 초과하셨습니다.");
                continue;
            }

            if (failCount >= 5) {
                System.out.println("5회 이상 실패하여 프로그램을 종료합니다. 5초 후 다시 입력해주세요");
                break;
            }

            if (password.equals("")) {
                System.out.println("로그인 성공");
                break;
            } else {
                failCount++;
                System.out.println("틀린 비밀번호입니다." + failCount + "회 실패, 다시 입력해주세요");
            }
        }
        sc.close();

    }

}
