package Flowchart;

import java.util.Scanner;

public class GradeTest {

    public static void main(String[] args) {

        System.out.println(" === 학점 판별기 === ");

        int score = 0;
        char grade =' ';
        System.out.println("점수를 입력해주세요!");

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if (score >= 100) {
            grade = 'A';
            if(grade > 90){
                grade = 'B';
            } else if(grade > 80){
                grade = 'C';
            } else if(grade > 70){
                grade = 'D';
            } else if(grade < 0 || grade > 60){
                grade = 'F';
            }
        }
        System.out.printf("당신의 학점은 %c입니다. %n", grade);

        //while (true) {
        //    double grade = sc.nextDouble();

        //    if (grade < 0 ) {
        //       System.out.println(" 입력값이 아닙니다. 다시 입력해주세요");
        //        continue;
        //    }

        //    if (grade < 0 ||grade < 60) {
        //        System.out.println("F 학점 입니다.");
        //        break;
        //    } else if (grade < 70 ) {
        //        System.out.println("D 학점 입니다.");
        //        break;
        //    } else if (grade < 80 ) {
        //        System.out.println("C 학점입니다.");
        //        break;
        //    } else if (grade < 90 ) {
        //        System.out.println("B 학점입니다.");
        //        break;
        //    } else if (grade <= 100 ) {
        //        System.out.println("A 학점입니다.");
        //        break;
        //    }

        }
    }
