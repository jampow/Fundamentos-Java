package com.fiap.fundamentos;

public class Construtor {
	
	public Construtor() {
		System.out.println("Construtor sem parâmetros");
	}
	
	public Construtor(String cor){
		this();
		System.out.println("Construtor com um parâmetro");
		System.out.println("cor: " + cor);
	}

	public Construtor(String cor, int velocidade, int marcha, int valor){
		this(cor);
		System.out.println("Construtor com 4 parâmetros");
		System.out.println("velocidade: " + velocidade);
		System.out.println("marcha: " + marcha);
		System.out.println("valor: " + valor);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Construtor();
		System.out.println("**********************");
		
		new Construtor("Azul");
		System.out.println("**********************");
		
		new Construtor("Azul", 70, 18, 500);
		System.out.println("**********************");

	}

}
