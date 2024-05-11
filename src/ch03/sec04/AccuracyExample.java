package ch03.sec04;

/**
 * 
 * @author Ryu
 *
 */

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result1 = apple - pieceUnit * number;
		System.out.println("남은 조각 수 : " + result1);
		
		int apple2 = 1;
		int pieceUnit2 = apple2 * 10;
		int number2 = 7;
		
		int result2 = pieceUnit2 - number2;
		System.out.println("남은 조각 수 : " + result2);
		System.out.println("1개의 사과에서 남은 양 : " + result2/10.0);
	}
}
