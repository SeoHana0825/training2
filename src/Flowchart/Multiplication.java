package Flowchart;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===구구단을 외자~ 구구단을 외자~===");
        System.out.println("출력 구구단 입력: ");

        int num = sc.nextInt();

        int i = 1;

        while (i < 10) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
            i++;
        }
    }


//        int num = sc.nextInt();
//
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(num + " * " + i + " = " + (num * i));
//        }
//    }
}
