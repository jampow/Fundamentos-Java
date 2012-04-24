package com.fiap._11exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

	public void readTxtFile(File file) throws IOException {
		//Leitor
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		//Lê linha a linha
		String linha = br.readLine();
		
		while(linha != null){
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
	}

	public static void main(String[] args) {
		try {
			new FileUtil().readTxtFile(new File("//texto.txt"));
		} catch (IOException e) {
			System.out.println("Erro ao abrir arquivo");
			e.printStackTrace();
		}

	}
}
