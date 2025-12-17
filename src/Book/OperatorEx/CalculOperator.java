package Book.OperatorEx;

public class CalculOperator {

    public static void main(String[] args) {

        // 산술 연산자
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a+b);
        System.out.printf("%d - %d = %d%n", a, b, a-b);
        System.out.printf("%d * %d = %d%n", a, b, a*b);
        System.out.printf("%d / %d = %d%n", a, b, a/b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);

        // 형변환(캐스팅) 산술 연산자 큰 int -> 작 byte 변환
        byte c =10;
        byte d =30;
        byte e = (byte) (c * d);
        System.out.println(e);

        // 작 int -> 큰 long 변환
        int f = 1_000_000;
        int g = 2_000_000;

        long h = f * g;
        System.out.println(h);

        // 큰 long -> 작 int 변환
        long i = 1_000_000 * 1_000_000;   // int 값이라 오버플로우 됨
        long j = 1_000_000 * 1_000_000L;  // int 에서 long 으로 가서 정상

        System.out.println("i= " +i);
        System.out.println("j= " +j);

        // 문자열 산술 연산자
        char ch1 = 'a';
        char ch2 = 'b';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d%n", ch2, ch1, ch2 - ch1);
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
        System.out.printf("'%c'= %d%n", ch1, (int) ch1);
        System.out.printf("'%c'= %d%n", ch2, (int) ch2);
        System.out.printf("'%c'= %d%n", zero, (int) zero);
        System.out.printf("'%c'= %d%n", two, (int) two);

        // Math.round() 메서드를 사용한 반올림

        double pi = 3.141592;
        double shortpi = Math.round(pi*1000) / 1000.0;
        System.out.println(shortpi);
    }
}
