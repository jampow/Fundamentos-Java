package com.fiap.fundamentos;

public class Conversao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		short s = 5;
		int i = 10;
		float f = 1.1f;
		double d = 5.5;
		
		int r1 = s + i;
		short r2 = (short) (s + i);
		float r3 = i + f;
		float r4 = (float) d;
		
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("r3: " + r3);
		System.out.println("r4: " + r4);
	}
}
