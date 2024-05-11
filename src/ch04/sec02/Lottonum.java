package ch04.sec02;
/**
 *
 * @author Ryu
 *
 */

/*
* claude 에서 생성한 로또번호 추출 코드
* 이해 해보기
*/

import java.util.Arrays;
import java.util.Random;

public class Lottonum {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateLotteryNumbers();
        System.out.println("로또 추첨 번호: " + Arrays.toString(lotteryNumbers));
    }

    public static int[] generateLotteryNumbers() {
        int[] lotteryNumbers = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int number;
            do {
                number = random.nextInt(45) + 1; // 1부터 45까지의 난수 생성
            } while (contains(lotteryNumbers, i, number)); // 중복 번호 제거
            lotteryNumbers[i] = number;
        }

        Arrays.sort(lotteryNumbers); // 번호 정렬
        return lotteryNumbers;
    }

    private static boolean contains(int[] array, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}