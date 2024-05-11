package ch03.sec08;

/**
 * 
 * @author Ryu
 *
 */


public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("\n----------------------------\n");
		
		byte d = -120;
		
		int u = d & 255;
		System.out.println(u);
		int u2 = Byte.toUnsignedInt(d);
		System.out.println(u2);

	}

}
