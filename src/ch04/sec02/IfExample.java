package ch04.sec02;

/**
 * 
 * @author Ryu
 *
 */

public class IfExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 90~100점 입니다.");
			System.out.println("등급은 A입니다.");
			}
		
		else if (score >= 80) {
			System.out.println("점수가 80~90점 입니다.");
			System.out.println("등급은 B입니다.");
		}
		
		else if (score >= 70) {
			System.out.println("점수가 70~80점 입니다.");
			System.out.println("등급은 c입니다.");
		}
		
		else if (score >= 60) {
			System.out.println("점수가 60~70점 입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		else {
			System.out.println("점수가 60점 미만 입니다.");
			System.out.println("등급은 F입니다.");
		}

	}

}
