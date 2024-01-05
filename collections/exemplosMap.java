package br.com.collections;

import java.util.HashMap;
import java.util.Map;

public class exemplosMap {

	public static void main(String[] args) {
		Map<Long, Pessoa> mapa = new HashMap<>();
		Pessoa lucas = new Pessoa(1L, "Lucas");
		
		mapa.put(1L, lucas);
		
		Pessoa lucas2 = mapa.get(1L);
	}
}
