package br.com.ifce.estrutura.arvore;

public class NoBinario {
	private String descricao;
	private NoBinario direita;
	private NoBinario esquerda;

	public NoBinario(String descricao) {
		direita = null;
		esquerda = null;
		this.descricao = descricao;
	}

	public NoBinario(String descricao, NoBinario direita, NoBinario esquerda) {
		super();
		this.descricao = descricao;
		this.direita = direita;
		this.esquerda = esquerda;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public NoBinario getDireita() {
		return direita;
	}

	public void setDireita(NoBinario direita) {
		this.direita = direita;
	}

	public NoBinario getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(NoBinario esquerda) {
		this.esquerda = esquerda;
	}
}
