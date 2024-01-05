package br.com.collections;

import java.util.HashMap;
import java.util.Map;

public class exemplosMap {

	public static void main(String[] args) {
		//UTILIZADO PARA MAPEAR SEUS OBJETOS COMO SE FOSSE UM SUPER ID
		Map<Long, Pessoa> mapa = new HashMap<>();
		Pessoa lucas = new Pessoa(1L, "Lucas");
		
		mapa.put(1L, lucas);
		
		Pessoa lucas2 = mapa.get(1L);
		System.out.println(lucas2.getNome() + " " + lucas.getId());
	}
}
