package ch03.sec07;

/**
 * 
 * @author Ryu
 *
 */

public class LogicalOperatorExample {
	public static void main(String[] args) {
		//int cc='A';
		int cc='a';
		//int cc='5';
		
		if( (65<=cc) & (cc<=90) ) {
			System.out.println("대문자");
		}
		
		if( (97<=cc) && (cc<=122) ) {
			System.out.println("소문자");
		}
		
		if( (48<=cc) && (cc<=57) ) {
			System.out.println("숫자");
		}
		
		//int v = 6;
		int v = 7;
		
		if( (v%2==0) | (v%3==0) ) {
			System.out.println("2 또는 3의 배수");
		}
		
		boolean r1 = (v%2==0) || (v%3==0);
		if( ! r1 /*! (v%2==0) | (v%3==0)*/ ) {
			System.out.println("2 또는 3의 배수 가 아님");
		}
		
		
	}

}
