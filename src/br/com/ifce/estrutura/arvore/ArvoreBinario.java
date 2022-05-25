package br.com.ifce.estrutura.arvore;

public class ArvoreBinario {
	private NoBinario root;

	public ArvoreBinario() {
		super();
		this.root = new NoBinario("raiz");
	}

	public ArvoreBinario(NoBinario root) {
		super();
		if (root == null) {
			this.root = new NoBinario("raiz");
		} else {
			this.root = root;
		}
	}

	public void addNo(String Add, String posicao, NoBinario noPai) {
		addNo(new NoBinario(Add), posicao, noPai);
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

	public String searchNo(String noDescription) {
		NoBinario no = searchNoRecursivo(noDescription, root);
		if(no != null) {
			return no.getDescricao() + " encontrado";
		} else {
			return noDescription + " não encontrado";
		}
	}

	public void removeNodeWithRemotion(String noDescription) {
		NoBinario no = searchNoRecursivo(noDescription, root);
		if(no != null) {
			if(no.getPai().getEsquerda() == no) {
				no.getPai().setEsquerda(null);
			} else {
				no.getPai().setDireita(null);
			}
			System.out.println("Nó removido");
		} else {
			System.out.println("Não encontrado");
		}
	}

	public void removeNodeWithoutRemotion(String noDescription) {
		NoBinario no = searchNoRecursivo(noDescription, root);
		if(no != null) {
			if(no.getPai().getEsquerda() == no) {
				no.getPai().setEsquerda(no.getEsquerda());
			} else {
				no.getPai().setDireita(no.getDireita());
			}
			System.out.println("Nó removido");
		} else {
			System.out.println("Não encontrado");
		}
	}

	private NoBinario searchNoRecursivo(String noDescription, NoBinario node) {
		if(node == null) {
			return null;
		}
		if(noDescription == node.getDescricao()) {
			return node;
		}
		NoBinario left = searchNoRecursivo(noDescription, node.getEsquerda());
		NoBinario right = searchNoRecursivo(noDescription, node.getDireita());
		if(left != null) {
			return left;
		} else {
			return right;
		}
	}
}
