package ch02.sec11;
/**
 * 
 * @author Ryu
 *
 */

public class VariableScopeExample {
	public static void main (String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
			System.out.println(v2);
		}
		int v3= v1 + 5; // v2는 사용할 수 없음.(if 블록에 있는건 if 안에서만 가능)
		System.out.println(v3);
	}
}
