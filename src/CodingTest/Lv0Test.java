package CodingTest;

public class Lv0Test {

        // 두 수의 값 곱하기
        public int solution (int num1, int num2) {
            int answer = 0;
            answer = num1 * num2;
            return answer;
        }

        // 두 수의 몫 구하기
        public int solution2(int num1, int num2) {
            int answer = num1 / num2;
            return answer;
        }

        // 두 수의 차 구하기
        public int solution3(int num1, int num2) {
            int answer = 0;

            answer = num1 - num2;
            return answer;
        }

        // 숫자 비교하기
        public int solution4(int num1, int num2) {
            int answer = 0;

            if (num1 == num2) {
                return 1;
            } else {
                return -1;
            }
        }

        // 두 수의 합 구하기
        public int solution5(int num1, int num2) {
            int answer = -1;

            answer = num1 + num2;
            return answer;
        }

        public int solution6(int num1, int num2) {
            return num1 - (-num2);
        }
}
