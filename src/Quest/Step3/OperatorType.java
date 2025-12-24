package Quest.Step3;

public enum OperatorType {
    // 1 enum 은 기본적으로 대문자로 먼저 써놓고 ; 로 끝낸 다음에 코드 쌓기
    // 11 @Override 시켜서 강제로 기동하게 만듦
    ADD('+'){
        @Override
        public double apply(double num1, double num2) {
            return num1 + num2;
        }
    },
    SUB('-'){
        @Override
        public double apply(double num1, double num2) {
            return num1 - num2;
        }
    },
    MUL('*') {
        @Override
        public double apply(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIV('/') {
        @Override
        public double apply(double num1, double num2) {
            if (num2 == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            return num1 / num2;
        }
    };

    // 2 symbol 지정 해주기
    private final char symbol;

    // 3 생성자 만들기
    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    // 10 추상 메서드 받을 수 있음
    public abstract double apply(double num1, double num2);

    // 4 ArithmeticCalculator 에서 사용하기 위한 메서드
    // enum 은 new 가 아닌 static 으로 사용가능
    public static OperatorType fromChar(char operator) {

        // 5 향상된 for 사용
        for (OperatorType op : values()) {
            if(op.symbol == operator) {
                return op;
            }
        }
        // 6 OperatorType 인데 symbol 과 같지 않은 경우 - 여기에서 예외처리 진행
        throw new IllegalArgumentException("지원하지 않는 문자입니다.");
    }
}
