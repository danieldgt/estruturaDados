package br.com.ifce.estrutura.arvore;

public class ArvoreBinario {
	private NoBinario root;

	public ArvoreBinario(NoBinario root) {
		super();
		this.root = root;
	}

	public void addNo(NoBinario noToAdd, String posicao, NoBinario noPai) {
		if (noPai == null) {
			addFilho(noToAdd, posicao, root);
		} else {
			addFilho(noToAdd, posicao, noPai);
		}
	}

	private void addFilho(NoBinario noToAdd, String posicao, NoBinario pai) {
		if (posicao.equals("direita")) {
			pai.setDireita(noToAdd);
		} else {
			pai.setEsquerda(noToAdd);
		}
	}
}
