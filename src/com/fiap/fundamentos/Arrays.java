package com.fiap.fundamentos;

public class Arrays {
	private int maior;
	private int menor;
	private int soma;
	private float media;
	
	public int maior(){ return maior; }
	
	public int menor(){ return menor; }
	
	public int soma(){ return soma; }
	
	public float media(){ return media; }
	
	public Arrays(int [] arr) {

		this.maior = arr[0];
		this.menor = arr[0];
		this.soma = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > this.maior) { this.maior = arr[i]; }
			if (arr[i] < this.menor) { this.menor = arr[i]; }
			this.soma += arr[i]; 
		}
		
		this.media = (float) this.soma / arr.length;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = {3, 1, 5, 9};
		int [] y = {3, 5, 9, 34, 76, 12, 4, 9, 9, 4, 6};
		Arrays arr1 = new Arrays(x);
		Arrays arr2 = new Arrays(y);

		System.out.println("arr1 maior: " + arr1.maior());
		System.out.println("arr1 menor: " + arr1.menor());
		System.out.println("arr1 soma: "  + arr1.soma() );
		System.out.println("arr1 media: " + arr1.media());
		System.out.println("***************************");
		System.out.println("arr2 maior: " + arr2.maior());
		System.out.println("arr2 menor: " + arr2.menor());
		System.out.println("arr2 soma: "  + arr2.soma() );
		System.out.println("arr2 media: " + arr2.media());
	}

}
