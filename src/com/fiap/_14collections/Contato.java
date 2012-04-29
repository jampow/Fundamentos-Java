package com.fiap._14collections;

public class Contato implements Comparable<Contato> {

	private String nome;
	
	public Contato(String nome) {
		this.nome = nome;
	}
	
	public String nome(){
		return this.nome;
	}
	
	public int compareTo(Contato cont) {
		return this.nome().compareTo(cont.nome());
	}
	
}
