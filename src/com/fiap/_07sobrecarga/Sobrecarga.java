package com.fiap._07sobrecarga;

public class Sobrecarga {
	
	public int calcular(int i){
		return -i;
	}
	
	public int calcular(int i, int j){
		return i + j;
	}
	
	public int calcular(int i, int j, String operacao){
		if (operacao == "+"){			
			return this.calcular(i, j);
		} else if (operacao == "-"){			
			return calcular(i, calcular(j));
		} else if (operacao == "*"){
			return i * j;
		} else if (operacao == "/"){
			return i / j;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Sobrecarga ex = new Sobrecarga();
		System.out.println(ex.calcular(10));
		System.out.println(ex.calcular(-5));
		System.out.println(ex.calcular(10, 7));
		System.out.println(ex.calcular(3, 4, "+"));
		System.out.println(ex.calcular(6, 1, "-"));
		System.out.println(ex.calcular(8, 4, "*"));
		System.out.println(ex.calcular(8, 2, "/"));
	}

}
