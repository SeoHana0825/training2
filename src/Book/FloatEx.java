package Book;

public class FloatEx {

    public static void main(String[] args) {
        // 실수형 float, double

        // 1. float ex
        float f = 9.12345678901234567890f;
        float f2 = 1.12345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("    123456789012345678901234%n");
        System.out.printf("f : %f%n", f);  // 소수점 이하 6자리까지 출력   -> 7자리에서 반올림됨
        System.out.printf("f : %24.20f%n", f);  // %24. 전체 24자리 중에서 20f% 20자리는 소수점 이하의 수를 출력하라
        System.out.printf("f2 : %24.20f%n", f2);
        System.out.printf("d : %24.20f%n", d);


        // 2. float 타입 값의 저장형식
        float fl = 9.1234567f;
        int i = Float.floatToIntBits(fl);
        //float 클래스의 floatToIntBits :float 타입의 값을 int 타입의 값으로 해석해서 반환한다.

        System.out.printf("%f%n", fl);
        System.out.printf("%X%n", i);
    }
}
