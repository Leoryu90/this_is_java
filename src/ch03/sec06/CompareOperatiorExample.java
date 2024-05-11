package ch03.sec06;

/**
 * 
 * @author Ryu
 *
 */

public class CompareOperatiorExample {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		boolean result1 = n1 == n2;
		boolean result2 = (n1 != n2);
		boolean result3 = (n1 <= n2);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		
		char c1 = 'A';
		int n3 = 66;
		boolean result4 = (c1 < n3); //int로 자동변환
		System.out.println("result4 = " + result4);		
		
		
		float n4 = 0.1f;
		double n5 = 0.1;
		boolean result5 = (n4 == n5);
		boolean result6 = (n4 == (float)n5);
		System.out.println("result5 = " + result5);
		System.out.println("result6 = " + result6);
		
		String srt1 = "자바";
		String srt2 = "java";
		boolean result7 = srt1. equals(srt2);
		boolean result8 = ! srt1. equals(srt2);
		System.out.println("result7 = " + result7);
		System.out.println("result8 = " + result8);

	}

}
