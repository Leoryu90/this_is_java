package ch02.sec08;
/**
 * 
 * @author Ryu
 *
 */



public class CastingExample {
	public static void main(String[] args) {
		int var1 = 10;
		byte var2 = (byte)var1;
		System.out.println("int > byte : " + var2);
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println("long > int : " + var4);
		
		int var5 = 44032;
		char var6 = (char) var5;
		System.out.println("int > char : " + var6);
		
		//실수에서 정수로 변환시 소수점은 다 없어짐.(실수타입은 항상 정수타입보다 크다.)
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println("double > int : " + var8);
	}
}
