package br.com.collections;

import java.util.ArrayList;
import java.util.List;

public class exemplosList {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa(1L, "Lucas"));
		Pessoa a = pessoas.get(0);
		
		for (Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
		
		System.out.println("---------------------------------------------------------------");
		pessoas.add(a);
		
		for (Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
	}
}
