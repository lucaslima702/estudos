package br.com.collections;

import java.net.URL;
import java.util.Scanner;

public class exemplosMap {

	public static void main(String[] args) {
		//UTILIZADO PARA MAPEAR SEUS OBJETOS COMO SE FOSSE UM SUPER ID
//		Map<Long, Pessoa> mapa = new HashMap<>();
//		Pessoa lucas = new Pessoa(1L, "Lucas");
//		
//		mapa.put(1L, lucas);
//		
//		Pessoa lucas2 = mapa.get(1L);
//		System.out.println(lucas2.getNome() + " " + lucas.getId());
		
		Scanner teclado = new Scanner(System.in);
		String nomeDoFilmeEscrito = teclado.nextLine();
		String nomeFormatado = nomeDoFilmeEscrito.replace(" ", "+");
		
		
		
		System.out.println("https://www.omdbapi.com/?t=" + nomeFormatado +"&apikey=d6ffc961");
	}
}
