package ch03.sec11;

/**
 * 
 * @author Ryu
 *
 */


public class ConditionalOperatorExample {
	public static void main(String[] args) {
		int s = 55;
		char g = (s > 90) ? 'A' : ((s > 80) ? 'B' : ((s > 70) ? 'C' : ((s >60) ? 'D' : 'F')));
		System.out.println(s + "점은 " + g + "등급입니다.");

	}

}
