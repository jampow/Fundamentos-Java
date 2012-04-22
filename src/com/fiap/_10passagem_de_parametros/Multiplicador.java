package com.fiap._10passagem_de_parametros;

public class Multiplicador {
	
	public static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println("["+i+"] -> "+arr[i]);
		}
		
	}
	
	public static int[] duplicador(int[] arr){
		int[] a = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			a[i] *= 2;
		}
		
		return a;
	}
	
	public static int[] duplicador$(int[] arr){
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		
		return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8};

		System.out.println("Imprime Array");
		Multiplicador.printArray(a);
		
		System.out.println("Multiplica sem alterar array passado no parâmetro");
		Multiplicador.duplicador(a);
		
		System.out.println("Imprime Array");
		Multiplicador.printArray(a);
		
		System.out.println("Multiplica sem alterar array passado por parâmetro");
		Multiplicador.duplicador$(a);
		
		System.out.println("Imprime Array modificado");
		Multiplicador.printArray(a);
	}

}
