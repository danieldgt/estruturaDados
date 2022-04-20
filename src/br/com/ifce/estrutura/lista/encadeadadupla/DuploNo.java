package br.com.ifce.estrutura.lista.encadeadadupla;

public class DuploNo {
	private String descricao;
	private DuploNo proximo;
	private DuploNo anterior;

	public DuploNo(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public DuploNo getProximo() {
		return proximo;
	}

	public void setProximo(DuploNo proximo) {
		this.proximo = proximo;
	}

	public DuploNo getAnterior() {
		return anterior;
	}

	public void setAnterior(DuploNo anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "Encadeado{" + "descricao='" + descricao + '\'' + '}';
	}
}