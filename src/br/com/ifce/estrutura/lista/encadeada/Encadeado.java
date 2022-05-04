package br.com.ifce.estrutura.lista.encadeada;

public class Encadeado {
	private String descricao;
	private Encadeado proximo;

	public Encadeado(String descricao, Encadeado proximo) {
		this.descricao = descricao;
		this.proximo = proximo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Encadeado getProximo() {
		return proximo;
	}

	@Override
	public String toString() {
		return "Encadeado{" + "descricao='" + descricao + '\'' + '}';
	}
}
