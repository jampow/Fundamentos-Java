package com.fiap._15io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

public class Escreve {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		StringBuffer sb = new StringBuffer("");
		
		while(true){
			linha = br.readLine();
			if (linha.trim().equals(":q"))
				break;
			sb.append(linha).append("\r\n");
		}
		
		FileOutputStream   fout = new FileOutputStream("./src/com/fiap/_15io/texto.gzip");
		GZIPOutputStream   zout = new GZIPOutputStream(fout);
		ObjectOutputStream out  = new ObjectOutputStream(zout);
		
		out.writeObject(sb.toString());
		
		out.close();
		zout.close();
		fout.close();
	}
}
