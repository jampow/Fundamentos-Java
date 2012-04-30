package com.fiap._16threads;

public class Cavalo extends Thread {
	private String nome;
	
	public Cavalo(String nome){
		this.nome = nome;
	}
	
	public void run() {
		for (int i = 1; i < 11; i++) {
			String msgm = i + "\t- " + this.nome;
			
			if (i == 10)
				msgm += "\t***CHEGOU!***";
				
			System.out.println(msgm);
			
			try {
				Thread.sleep((int)(Math.random() * 5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		Cavalo cav1 = new Cavalo("Preto ");
		Cavalo cav2 = new Cavalo("Branco");
		Cavalo cav3 = new Cavalo("Malhado");
		Cavalo cav4 = new Cavalo("Marrom");

		cav1.start();
		cav2.start();
		cav3.start();
		cav4.start();
	}


}
