package br.com.collections;

import java.util.HashSet;
import java.util.Set;

public class exemplosSet {

	public static void main(String[] args) {
		//SET NAO ACEITA ADICIONAS OBJETOS COM OS MESMOS PARAMETROS NA LISTA
		Set<Pessoa> pessoas = new HashSet<>();
		Pessoa lucas = new Pessoa(1L, "Lucas");
		pessoas.add(lucas);
		
		for (Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
		
		System.out.println("-------------------------------------------------");
		
		//visto na aula
//		boolean verification = pessoas.add(new Pessoa(1L, "Lucas"));
//		if(verification) {
//			System.out.println("Pessoa adicionada");
//		}else {
//			System.out.println("Pessoa nao foi adicionada");
//		}
		
		for (Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
	}
}
