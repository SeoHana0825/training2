package Flowchart;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        System.out.println("삼각형 성립 조건을 판별합니다. 판별할 '각 변'의 길이를 입력해주세요");
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("가장 긴 변을 입력해주세요");
            int longTriangle = sc.nextInt();
            if (longTriangle < 0) {
                System.out.println("음수는 입력할 수 없습니다. 다시 입력해주세요");
                continue;
            } else if (longTriangle == 0) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }

            System.out.println("두 번째 변을 입력해주세요");
            int triangle1 = sc.nextInt();
            if (triangle1 < 0) {
                System.out.println("음수는 입력할 수 없습니다. 다시 입력해주세요");
                continue;
            } else if (triangle1 == 0) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }

            System.out.println("세 번째 변을 입력해주세요");
            int triangle2 = sc.nextInt();
            if (triangle2 < 0) {
                System.out.println("음수는 입력할 수 없습니다. 다시 입력해주세요");
                continue;
            } else if (triangle2 == 0) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }


            if (triangle1 + triangle2 < longTriangle) {
                System.out.println("삼각형의 성립조건에 성립됩니다.");
                break;
            } else {
                System.out.println("삼각형의 성립조건에 맞지 않습니다. 다시 입력하시겠습니까? (yes : 재입력)");
                String answer = sc.next();
                if (answer.equalsIgnoreCase("yes")) {
                    continue;
                } else {
                    System.out.println("시스템을 종료합니다.");
                    break;
                }
            }
        }
        sc.close();
    }
}
