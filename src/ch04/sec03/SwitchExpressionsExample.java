package ch04.sec03;
/**
 * @author Ryu
 */
/*
 * switch문 학습2.
 */
public class SwitchExpressionsExample {
    public static void main(String[] args) {
        // 문자열 생성
        String letters = "abc";

        // Math.random()을 이용하여 랜덤 인덱스 생성
        int randomIndex = (int) (Math.random() * letters.length());

        // 랜덤 문자 출력
        char grade = letters.charAt(randomIndex);
        /*
        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반회원입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }
        */

        switch (grade) {
            case 'A', 'a' -> System.out.println("우수회원입니다.");

            case 'B', 'b' -> System.out.println("일반회원입니다.");

            default -> System.out.println("손님입니다.");
        }
    }
}
