package ch02.sec02;
/**
 * @author Ryu
 */

// 클래스 선언
public class IntegerLiteralExample1 {
	// 프로그램 실행 진입점
	public static void main(String[] args) {
		// 콘솔에 출력하는 실행문
		int var1 = 0b10100; // 2진수 20
		int var2 = 0206; // 8진수
		int var3 = 1116; // 10진수
		int var4 = 0xb3; // 16진수
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("ver4 : " + var4);
	}

}
