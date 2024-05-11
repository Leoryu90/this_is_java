package ch02.sec01;
/**
 * @author Ryu
 */

public class Variable {
	// 프로그램 실행 진입점
	public static void main(String[] args) {
		//콘솔에 출력하는 실행문
		int hour = 3;
		int minuit = 5;
		System.out.println(hour + "시간" + minuit + "분");
		
		int totalminuit = (hour * 60) + minuit;
		System.out.println("총" + totalminuit + "분");

	}

}
