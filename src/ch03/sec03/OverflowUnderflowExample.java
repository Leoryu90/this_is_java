package ch03.sec03;

/**
 * 
 * @author Ryu
 *
 */



public class OverflowUnderflowExample {
	public static void main(String[] args) {
		byte n1 = 125;
		for(int i=0; i<5; i++) {
			n1++;
			System.out.println("n1 = " + n1);
		}
	
	System.out.println("------------------");
	
		byte n2 = -125;
		for(int i=0; i<5; i++) {
			n2--;
			System.out.println("n2 = " + n2);
		}
		
		int x = 1000000;
		int y = 1000000;
		long z = (long)x * y;
		System.out.println("z = " + z);
	}
}
