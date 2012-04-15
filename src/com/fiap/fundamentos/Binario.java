package com.fiap.fundamentos;

public class Binario {

	public static String converteInteiro(int numero){
		String binario = "";
		
		while(numero > 0){
			binario = (numero % 2) + binario;
			numero = numero / 2;
		}

		return binario;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Binario.converteInteiro(12));
		System.out.println(Binario.converteInteiro(343));
		System.out.println(Binario.converteInteiro(1235));
		System.out.println(Binario.converteInteiro(87654));
	}

}
