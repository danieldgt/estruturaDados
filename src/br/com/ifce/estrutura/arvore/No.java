package br.com.ifce.estrutura.arvore;

public class No {
	private String descricao;
	private No[] filhos;// N Filhos

	public No(String descricao) {
		this.descricao = descricao;
		filhos = null;
	}

	public No(String descricao, No[] filhos) {
		super();
		this.descricao = descricao;
		this.filhos = filhos;
	}
}
