package Practice.Algorithm;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

    // 테스트용 입력값 설정
    int[] numbers = {2, 11, 7, 15};
    int target = 9; // 2+7 == 9, 인덱스 (0,2)반환

    int[] result = findPairs(numbers, target);
        System.out.println(Arrays.toString(result));
        // 인덱스는 바로 출력이 안되서 Arrays.toString 으로 result를 변환해야한다

    // 결과 저장 변수 findPairs  메서드 : 실제로 인덱스 검사
}
    // 인덱스 findPairs 스타틱 메서드 자동 소환
    public static int[] findPairs(int[] numbers, int target) {
    // 1. 배열을 순화해서 첫번째 수 선택
        for (int i = 0; i < numbers.length; i++) {
            // 1-1 배열의 첫 번째 요소부터 순차적으로 선택
            int num1 = numbers[i]; // 첫번째 수 선택

            // 2 두번째 수 선택 및 검증 단계
            // 2-1 첫번째 수 다음 인덱스부터 배열 끝까지 순회해서 선택
            // 동일한 두 요소를 선택하면 안됀다!!!
            for (int j = i+1; j < numbers.length; j++) {

                //2-2 현재 선택된 두 수의 합이 target 과 같은지 확인
                int num2 = numbers[j];
                if(num1+num2 == target);

                // 2-3 target과 같다면 두 수의 인텍스를 반환
                return new int[]{i,j};
            }
        }

        // 3. 결과 반환 단계
        // 3-1 조합을 찾지 못한 경우 빈 배열 반환
        return new int [] {};
    }

}