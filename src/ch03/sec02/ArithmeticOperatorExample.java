package ch03.sec02;

/**
 * 
 * @author Ryu
 *
 */

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		byte n1 = 10;
		byte n2 = 4;
		int n3 = 3;
		long n4 = 10L;
		
		int result1 = n1 + n2;
		System.out.println("result 1 : " + result1);
		
		long result2 = n1 + n2 - n4;
		System.out.println("result 2 : " + result2);
		
		double result3 = (double)n1 / n2;
		System.out.println("result 3 : " + result3);
		
		int result4 = n1 % n3;
		System.out.println("result 4 : " + result4);
	}
}
