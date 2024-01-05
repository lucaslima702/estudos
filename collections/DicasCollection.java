package br.com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DicasCollection {

	public static void main(String[] args) {
		
		String pokemon1 = "Midoking";
		String pokemon2 = "Mewtwo";
		String pokemon3 = "Zapdos";
		
		ArrayList<String> pokemons = new ArrayList<>();
		pokemons.add(pokemon1);
		pokemons.add(pokemon2);
		pokemons.add(pokemon3);
		
		System.out.println(pokemons);
		
		Collections.sort(pokemons);
		System.out.println(pokemons);
		
		pokemons.add(pokemon3);
		System.out.println(pokemons);
		
		HashSet<String> listaNaoDuplicada = new HashSet<>(pokemons);
		System.out.println(listaNaoDuplicada);
	}
}
