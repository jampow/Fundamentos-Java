package com.fiap._08construtor;

public class Filho extends Pai{
	

	public Filho(String msg) {
		super(msg);
		System.out.println("Filho: " + msg);
	}

	public static void main(String[] args) {

		new Filho("Mensagem de teste");
	}

}
