package com.fiap._06sobrescrita;

public class Cachorro extends Animal {
	
	public void fazerBarulho(){
		System.out.println("Barulho de cachorro");
	}
	
	public void abanarRabo(){
		System.out.println("Abanar rabo de cachorro");
	}
	
	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro();
		cao.baterCoracao();
		cao.fazerBarulho();
		cao.abanarRabo();
	}

}
