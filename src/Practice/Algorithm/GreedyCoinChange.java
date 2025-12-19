package Practice.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyCoinChange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] coins = {500, 100, 50, 10};

        // 거스름돈 금액 입력 받기
        int target = scanner.nextInt();

        // 결과 출력
        System.out.println(coinChange(coins, target));
    }

    private static int coinChange(int[] coins, int target) {

        // 1 초기화 단계
        // 1-1 각 동전별로 사용 가능한 최대 개수 계산
        int [] maxCoins = new int[coins.length];
        for(int i = 0; i < coins.length; i++){
            maxCoins[i] = target / coins[i];
        }
        // 1-2 최소 동전 개수를 저장한 변수를 최댓값으로 초기화
        int minCoins = Integer.MAX_VALUE;

        //2 모든 조합 시도 단계
        // 2-1 500원을 0개부터 최대 개수까지 반복
        for(int i = 0; i <= maxCoins[0]; i++){
            // 2-2 100원을 0개부터 최대 개수까지 반복
            for(int j = 0; j <= maxCoins[1]; j++){
                // 2-3 50원을 0개부터 최대 개수까지 반복
                for(int k = 0; k <= maxCoins[1]; k++){
                    // 2-4 10원을 0개부터 최대 개수까지 반복
                    for(int l = 0; l <= maxCoins[1]; l++){

                        // 각 조합에 대해 현재 조합으로 만들어지는 총 금액 계산
                        int currentSum = coins[0]*i + coins[1]*j + coins[2]*k + coins[3]*l;

                        // 목표 금액과 일치하는지 확인
                        if (currentSum == target){

                            // 일치하면 사용된 동전 개수과 현재 최소값 비교하여 갱신
                            minCoins = Math.min(minCoins, i+j+k+l);

                        }
                    }
                }
            }
        }
        // 500(2) + 100(2) + 50(1) + 10(1)

        //3 결과 반환 단계
        // 3-1 찾은 동건 개수 반환
        // 3-2 해를 찾지 못한 경우 -1 반환

        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
        // 사망 연산자 (if 문도 가능) : 간결하게 가능
    }
}
