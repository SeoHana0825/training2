package Book;

public class Main {
    public static void main(String[] args) {

        // 정수 int (integer) year 에 0을 저장
        int year = 0;
        // 정수 int (integer) age 에 14를 저장
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        // 정수 int year 에 age (14) +2000 을 더한 값을 저장
        year = age + 2000;
        // 정수 int age 에 age (14) +1 을 더한 값을 저장
        age = age + 1;

        System.out.print(year);
        System.out.print(age);

        // 왼쪽은 저장하는 Box 이기 때문에 오른쪽에 지정하는 값에 따라 저장된 값이 달라진다. 수학적으로 생각하면 안됨!!!!
    }

    public static class ValueSwap {
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
}
