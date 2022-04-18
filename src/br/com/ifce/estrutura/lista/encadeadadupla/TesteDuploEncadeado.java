package br.com.ifce.estrutura.lista.encadeadadupla;

public class TesteDuploEncadeado {

	public static void main(String[] args) {
		ListaNo listaDupla = new ListaNo(new DuploNo(null), new DuploNo(null));
		System.out.println(listaDupla.count());

		listaDupla.add(new DuploNo("Daniel"));
		listaDupla.add(new DuploNo("Joao"));
		listaDupla.add(new DuploNo("Francisco"));

		System.out.println(listaDupla.count());
	}
}
