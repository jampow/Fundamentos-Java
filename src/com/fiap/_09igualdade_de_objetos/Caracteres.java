package com.fiap._09igualdade_de_objetos;

public class Caracteres {
	
	private String texto;
	public void   texto(String t){ texto = t;	 }
	public String texto()        { return texto; }

	public Caracteres(){}
	public Caracteres(String t){ texto = t;}

	public boolean equals(Object obj){
		if (!(obj instanceof String)){
			return false;
		}
		
		String a;
		String b;
		a = texto.replaceAll("[0-9]", "");
		b = ((String) obj).replaceAll("[0-9]", "");
		return a.equals(b);
	}
	
	public static void main(String[] args) {
		Caracteres c = new Caracteres("teste");
		System.out.println(c.equals("o2i"));
		
		c.texto("1oi4");
		System.out.println(c.equals("o2i"));
	}

}
