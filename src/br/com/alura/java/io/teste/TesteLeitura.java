package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com Arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");//Criando o fluxo concreto com Arquivo, mas binario
		InputStreamReader isr = new InputStreamReader(fis); // Melhorando os dados binarios para caracteres
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		System.out.println(linha);
		
		br.close();
	}
	
}
