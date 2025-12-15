package Variavle;

public class ValueSwap {
    public static void main(String[] args) {

        int x = 10, y = 20;
        // int x 에 10을 저장, y에 20을 저장
        int swap = 0;
        // 바꿔줄 예비 swap 에는 0을 저장

        System.out.println("x: " + x + " y: " + y);
        // x: 10, y: 20

        swap = x;
        // 바꿔줄 예비 swap 에 x값 10을 저장
        x = y;
        // x 에 y값 20을 저장 (x 에 들어있던 10은 없어짐)
        y = swap;
        // y 에 swap 에 넣어두었던 10을 저장 (y 에 들어있던 20은 없어짐)

        System.out.println("x: " + x + " y: " + y);
        // x: 20, y: 10
    }
}
