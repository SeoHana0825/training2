package Book;

public class CharToCode {

    public static void main(String[] args) {

      // 1. char 를 통한 문자 유니코드 확인
      char ch = 'A';  // char ch = 65
      int cod = (int)ch;  // ch 에 저장된 값을 int 타임으로 변환하여 저장

        System.out.printf("%c=%d(%#x)%n", ch, (int)ch, (int)ch);

        char hch = '가';   // char ch = 0xAC00
        System.out.printf("%c=%d(%#x)%n",hch, (int)hch, (int)hch);
        // ch 에 저장된 값을 int 다입으로 변환하여 저장

      // 2. SpecialCharEx 특수문자 문자 리터널
        System.out.println('\'');           // ''' 처럼 할 수 없다
        System.out.println("abc\t123\b456");  // \b에 의해 3이 지워진다
        System.out.println('\n');   // 개행 (new line) 문자 출력하고 개행
        System.out.println("\"Hello\""); // 큰따옴표를 출력하려면 이렇게 출력
        System.out.println("c:\\"); //뒤에 슬래쉬가 하나 없어진다
    }
}
