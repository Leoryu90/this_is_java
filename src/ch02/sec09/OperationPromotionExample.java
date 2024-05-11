package ch02.sec09;
/**
 * 
 * @author Ryu
 *
 */


//클래스 선언
public class OperationPromotionExample {
	//프로그램 실행 진입점
	public static void main(String[] args) {
		//콘솔에 출력하는 실행문
		
		byte result = 10 + 20;
		System.out.println(result);
		
		byte x = 10;
		byte y = 20;
		int result1 = x + y;
		System.out.println(result1);
		
		byte v1 = 10;
		int v2 = 87;
		long v3 = 43935L;
		long r2 = v1 + v2 + v3;
		System.out.println(r2);
		System.out.println((char)r2);
		
		char c1 = '가';
		char c2 = 1;
		int r3 = c1 + c2;
		System.out.println(r3);
		System.out.println((char) r3);
		
		int i1 = 10;
		int r4 = i1 / 2;
		System.out.println(r4);
		
		int v9 = 10;
		float r5 = v9 / 4.0f;
		System.out.println(r5);
		
		int v10 = 4;
		int v11 = 16;
		double r6 = (double) v10 / v11;
		System.out.println(r6);
	}
}
