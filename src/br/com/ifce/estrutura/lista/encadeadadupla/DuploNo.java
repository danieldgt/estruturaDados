package br.com.ifce.estrutura.lista.encadeadadupla;

public class DuploNo {
	private String descricao;
	private DuploNo proximo;
	private DuploNo anterior;

	public DuploNo(String descricao) {
		super();
		this.descricao = descricao;
	}

	public DuploNo getProximo() {
		return null;
	}

	public String getDescricao() {
		return descricao;
	}

	public DuploNo getAnterior() {
		return anterior;
	}

	public void setAnterior(DuploNo duploNo) {
		this.anterior = duploNo;
	}
	
	@Override
	public String toString() {
		return "Encadeado{" + "descricao='" + descricao + '\'' + '}';
	}
}