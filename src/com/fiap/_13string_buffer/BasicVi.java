package com.fiap._13string_buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicVi {

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
		System.out.println(sb.toString());
	}
	
}
