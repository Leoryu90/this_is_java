package ch02.sec01;
/**
 * @author Ryu
 */

// 클래스 선언
public class Variable2 {
	// 프로그램 실행 진입점
	public static void main(String[] args) {
		// 콘솔에 출력하는 실행문
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" +y);

	}

}
