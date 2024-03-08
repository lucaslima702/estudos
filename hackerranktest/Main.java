package br.com.hackerranktest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String string = teclado.nextLine();
		int repeticoes = 0;
		char ultimaLetra = ' ';
		StringBuilder sb = new StringBuilder();
		StringBuilder palavrasSB = new StringBuilder();
		
		for(int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if(Character.isDigit(c)) {
				repeticoes = Character.getNumericValue(c);
				ultimaLetra = string.charAt(i - 1);
				for(int l = 0; l < repeticoes; l++) {
					sb.append(ultimaLetra);
				}
				sb.deleteCharAt(i);
			}else {
				sb.append(c);
			}
		}
		
		String stringFormatada = sb.toString();
		String[] palavras = stringFormatada.split(" ");
		List<String> lista = Arrays.asList(palavras);
		Collections.reverse(lista);
		
		for (String string2 : lista) {
			palavrasSB.append(string2).append(" ");
		}
		
		System.out.println(palavrasSB.toString());
		teclado.close();
	}
}
