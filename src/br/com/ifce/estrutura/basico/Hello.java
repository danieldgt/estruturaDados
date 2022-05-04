package br.com.ifce.estrutura.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hello {
	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 2, 3, 56, 57, 80);
		String nome = "daniel";
		Funcionalidades funcionalidades = new Funcionalidades();
		Funcionalidades.maioresQueFuncional(numeros, 0);
		// funcionalidades.nome = "rafael";
	}
}

class Funcionalidades {

	public static final String nome = "Daniel";

	public static List maioresQueFuncional(List<Integer> lista, int numero) {
		return lista.stream().filter(num -> num > numero).collect(Collectors.toList());
	}

	public List<Integer> maioresQue(List<Integer> lista, int numero) {
		List<Integer> novosNumeros = new ArrayList<Integer>();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > numero) {
				novosNumeros.add(lista.get(i));
			}
		}
		return novosNumeros;
	}
}
