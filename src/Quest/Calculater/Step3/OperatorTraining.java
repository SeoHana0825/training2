package Quest.Calculater.Step3;

public enum OperatorTraining {

    ADD('+') {
        @Override
        public double apply (double num1, double num2) {
            return num1 + num2;
        }
    },
    SUB('-') {
        @Override
        public double apply (double num1, double num2) {
            return num1 - num2;
        }
    },
    MUL('*') {
        @Override
        public double apply (double num1, double num2) {
            return num1 * num2;
        }
    },
    DIV('/') {
        @Override
        public double apply (double num1, double num2) {
            if (num2 == 0) {
                throw new ArithmeticException ("0으로 나눌 수 없습니다.");
            }
            return num1 / num2;
        }
    };

    private final char symbol;

    OperatorTraining(char symbol) {
        this.symbol = symbol;
    }

    public abstract double apply (double num1, double num2);

    public static OperatorTraining fromChar(char operator) {
        for (OperatorTraining op : values()) {
            if (op.symbol == operator) {
                return op;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
    }

}