package Flowchart;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" === BMI 판별기 ===");

        while (true) {

            System.out.println("키(cm)를 입력해주세요");
            double heightCm = sc.nextDouble();
            if (heightCm < 125.9) {
                System.out.println("범위에 맞지 않습니다. 다시 입력해주세요");
                continue;
            }

            System.out.println("체중(kg)을 입력해주세요");
            double weight = sc.nextDouble();
            if (weight < 20.9) {
                System.out.println("범위에 맞지 않습니다. 다시 입력해주세요");
                continue;
            }

            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);

            if (bmi > 10 && bmi < 18.5) {
                System.out.printf("BMI %.1f = 저체중 입니다", bmi);
                break;
            } else if (bmi < 20) {
                System.out.printf("BMI %.1f = 저체중 입니다", bmi);
                break;
            } else if (bmi < 30) {
                System.out.printf("BMI %.1f = 저체중 입니다", bmi );
                break;
            } else if (bmi >= 30) {
                System.out.printf("BMI %.1f = 저체중 입니다", bmi);
                break;
            }
            break;

        } sc.close();
    }
}
