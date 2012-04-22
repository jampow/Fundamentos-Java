package com.fiap._01classe;

import java.math.BigDecimal;

public class Bicicleta {
	//Definindo atributos
	private String      cor;
	private int         velocidade;
	private int         marcha;
	private BigDecimal  valor;

	//get set para os atributos
	public void         setCor(String cor)      { this.cor = cor; }
	public String       getCor()                { return this.cor; }

	public void         setVelocidade(int vel)  { this.velocidade = vel; }
	public int          getVelocidade()         { return this.velocidade; }

	public void         setMarcha(int marcha)   { this.marcha = marcha; }
	public int          getMarcha()             { return this.marcha; }

	public void         setValor(double val)    { this.valor = new BigDecimal(val); }
	public BigDecimal   getValor()              { return this.valor; }
	
	public static void main(String[] args) {
		//nova instância de bicicleta em bic
		Bicicleta bic = new Bicicleta();
		
		//Definindo valores para as propriedades
		bic.setCor("Azul");
		bic.setVelocidade(60);
		bic.setMarcha(1);
		bic.setValor(700.00);

		//Imprimindo valores das propriedades
		System.out.println("cor: "        + bic.getCor());
		System.out.println("velocidade: " + bic.getVelocidade());
		System.out.println("marcha: "     + bic.getMarcha());
		System.out.println("valor: "      + bic.getValor());

	}

}
