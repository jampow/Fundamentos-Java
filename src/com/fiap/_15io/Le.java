package com.fiap._15io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class Le {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin  = new FileInputStream("./src/com/fiap/_15io/texto.gzip");
		GZIPInputStream zin  = new GZIPInputStream(fin);
		ObjectInputStream in = new ObjectInputStream(zin);
		
		String texto = (String) in.readObject();
		System.out.println(texto);
		
		in.close();
		zin.close();
		fin.close();
	}

}
