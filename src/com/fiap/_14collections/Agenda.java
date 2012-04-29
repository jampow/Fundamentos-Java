package com.fiap._14collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class Agenda {

	private TreeMap<String, TreeSet<Contato>> ag;
	
	public Agenda() {
		this.ag = new TreeMap<String, TreeSet<Contato>>();
	}
	
	public void addContato(String nome){
		String first = nome.substring(0,1).toUpperCase();
		
		if (this.ag.get(first) == null) {
			TreeSet<Contato> ts = new TreeSet<Contato>();
			ts.add(new Contato(nome));
			ag.put(first, ts);
		} else {
			TreeSet<Contato> ts = ag.get(first);
			ts.add(new Contato(nome));
		}
	}
	
	public void print(){
		for (String letra : this.ag.keySet()) {
			System.out.println(letra);
			this.printLetra(letra);
		}
	}
	
	public void printLetra(String letra){
		TreeSet<Contato> contatos = this.ag.get(letra);
		for (Contato contato : contatos) {
			System.out.println("=> "+contato.nome());
		}
	}
	
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.addContato("Ana");
		agenda.addContato("Bruno");
		agenda.addContato("Amélia");
		agenda.addContato("Cristina");
		agenda.addContato("Bianca");
		agenda.addContato("Ailton");
		agenda.addContato("Beatriz");
		agenda.addContato("Carlos");
				
		agenda.print();
	}
}