package br.com.ifce.estrutura.lista.encadeadadupla;

public class TesteDuploEncadeado {

	public static void main(String[] args) {
		ListaNo listaDupla = new ListaNo(null, null);

		listaDupla.add(new DuploNo("Daniel"));
		listaDupla.add(new DuploNo("Joao"));
		listaDupla.add(new DuploNo("Francisco"));
		listaDupla.add(new DuploNo("Raimundo"));

		System.out.println("Count manual: " + listaDupla.countManual());
		System.out.println("Count por variavel: " + listaDupla.getCount());
		
		System.out.println("Tem nome francisco? " + listaDupla.containsName("francisco2"));
	
		//TODO: dizer qual posicao foi encontrado o nome?
		//TODO: imprimir a lista com quebra de linha e o numero da posição
		//TODO: add em uma posição específica um determinado no
		//TODO: add na frente
	}
}
