package ch02.sec06;
/**
 * 
 * @author Ryu
 *
 */

public class StringExample {
	public static void main(String[] args) {
		String name = "유석호";
		String job = "프로그래머 꿈나무";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\r");
		System.out.print("배웁니다.\n");
		
		System.out.println(name);
		System.out.println(str);
	}
}
